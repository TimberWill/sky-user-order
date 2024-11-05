package com.sky.user.service;

import com.sky.user.pojo.dto.UserLoginDTO;
import com.sky.user.pojo.vo.UserLoginVO;

public interface UserService {
    UserLoginVO login(UserLoginDTO userLoginDTO);
}
