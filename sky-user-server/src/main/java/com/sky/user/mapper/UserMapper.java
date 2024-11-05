package com.sky.user.mapper;

import com.sky.user.pojo.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserLogin getUserByName(String username);
}
