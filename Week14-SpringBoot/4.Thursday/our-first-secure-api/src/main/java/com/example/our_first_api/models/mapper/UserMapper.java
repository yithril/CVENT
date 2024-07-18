package com.example.our_first_api.models.mapper;

import com.example.our_first_api.models.User;
import com.example.our_first_api.models.dto.UserDTO;
import com.example.our_first_api.models.dto.UserResponseDTO;

public class UserMapper {
    public static User toUser(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        return user;
    }

    public static UserResponseDTO toUserResponseDTO(User user) {
        if (user == null) {
            return null;
        }
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setUsername(user.getUsername());
        return userResponseDTO;
    }
}
