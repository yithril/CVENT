package com.example.our_first_api.config.filters;

import com.example.our_first_api.services.ApiUserDetailsService;
import com.example.our_first_api.util.JwtUtil;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    @Autowired
    private ApiUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    private final List<String> excludedUrls = Arrays.asList(
            "/api/auth/register",
            "/authenticate",
            "/auth/welcome",
            "/auth/addNewUser",
            "/auth/generateToken",
            "/swagger-ui/",
            "/v3/api-docs/"
    );

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        String requestUri = request.getRequestURI();

        if (excludedUrls.stream().anyMatch(requestUri::startsWith)) {
            chain.doFilter(request, response);
            return;
        }

        final String authorizationHeader = request.getHeader("Authorization");

        String username = null;
        String jwt = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
            try {
                username = jwtUtil.extractUsername(jwt);
            } catch (ExpiredJwtException e) {
                // Handle expired token
                System.out.println("JWT token has expired");
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "JWT token has expired");
                return;
            } catch (Exception e) {
                // Handle other exceptions
                System.out.println("Error extracting username from JWT: " + e.getMessage());
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid JWT token");
                return;
            }
        }

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

            if (jwtUtil.validateToken(jwt, userDetails)) {

                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            } else {
                System.out.println("JWT token validation failed");
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "JWT token validation failed");
                return;
            }
        }

        chain.doFilter(request, response);
    }
}
