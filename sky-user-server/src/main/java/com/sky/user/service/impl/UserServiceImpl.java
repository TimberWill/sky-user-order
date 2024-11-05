package com.sky.user.service.impl;

import com.sky.common.constant.JwtClaimsConstant;
import com.sky.common.exception.BaseException;
import com.sky.common.properties.JwtProperties;
import com.sky.common.utils.JwtUtil;
import com.sky.user.mapper.UserMapper;
import com.sky.user.pojo.dto.UserLoginDTO;
import com.sky.user.pojo.entity.UserLogin;
import com.sky.user.pojo.vo.UserLoginVO;
import com.sky.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-04 16:32
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private JwtProperties jwtProperties;

    @Override
    public UserLoginVO login(UserLoginDTO userLoginDTO) {
        String username = userLoginDTO.getUsername();
        String password = userLoginDTO.getPassword();
        //1. 校验用户名和密码
        UserLogin userLogin = userMapper.getUserByName(username);
        if (userLogin == null){
            throw new BaseException("用户名或密码错误");
        }
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!password.equals(userLogin.getPassword())){
            throw new BaseException("用户名或密码错误");
        }

        //2. 生成token
        HashMap<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.USER_ID, userLogin.getId());
        String token = JwtUtil.createToken(
                jwtProperties.getUserSecretKey(),
                jwtProperties.getUserTtl(),
                claims);

        //3. 封装vo
        UserLoginVO loginVO = UserLoginVO.builder()
                .token(token)
                .userId(userLogin.getId())
                .username(userLogin.getUsername())
                .build();

        return loginVO;
    }
}
