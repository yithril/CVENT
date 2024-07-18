package com.example.our_first_api.services;

import com.example.our_first_api.models.User;
import com.example.our_first_api.models.dto.UserDTO;
import com.example.our_first_api.models.dto.UserResponseDTO;
import com.example.our_first_api.models.mapper.UserMapper;
import com.example.our_first_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserResponseDTO registerNewUser(UserDTO userDTO) {
        User user = UserMapper.toUser(userDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("ROLE_USER");
        }
        User savedUser = userRepository.save(user);
        return UserMapper.toUserResponseDTO(savedUser);
    }
}
