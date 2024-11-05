package com.sky.user.controller;

import com.sky.user.pojo.dto.UserLoginDTO;
import com.sky.user.pojo.vo.UserLoginVO;
import com.sky.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-04 15:05
 **/
@RestController
@RequestMapping("/user/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public UserLoginVO login(@RequestBody UserLoginDTO userLoginDTO){
        log.info("用户登录：{}",userLoginDTO);
        return userService.login(userLoginDTO);
    }

    @PostMapping("/logout")
    public void logout(){

    }
}
