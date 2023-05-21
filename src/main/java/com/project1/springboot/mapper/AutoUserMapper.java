package com.project1.springboot.mapper;

import com.project1.springboot.dto.UserDto;
import com.project1.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER= Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
