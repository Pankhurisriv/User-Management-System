package com.project1.springboot.mapper;

import com.project1.springboot.dto.UserDto;
import com.project1.springboot.entity.User;

public class UserMapper {

    //convert User JPA Entity into UserDTO
    public static UserDto mapToUserDto(User user){
        UserDto userDto=new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    //covert UserDTo into user JPA Entity
    public static User mapToUser(UserDto userDto){
        User user=new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
