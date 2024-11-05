package com.sky.common.interceptor;

import cn.hutool.core.util.StrUtil;
import com.sky.common.constant.JwtClaimsConstant;
import com.sky.common.properties.JwtProperties;
import com.sky.common.utils.JwtUtil;
import com.sky.common.utils.UserContext;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: sky-user-order
 * @description: jwt拦截器（登录信息校验）
 * @author: whl
 * @create: 2024-10-25 11:08
 **/
@Component
@Slf4j
public class JwtInterceptor implements HandlerInterceptor {

    @Resource
    private JwtProperties jwtProperties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1. 获取用户信息
        String token = request.getHeader(jwtProperties.getUserTokenName());
        //2. 判断用户信息是否有效，存入ThreadLocal
        try {
            Claims claims = JwtUtil.parseToken(jwtProperties.getUserSecretKey(), token);
            String userInfo = claims.get(JwtClaimsConstant.USER_ID).toString();

            if (StrUtil.isNotBlank(userInfo)){
                UserContext.setUser(Long.valueOf(userInfo));
            }

            //3. 放行
            return true;
        }catch (Exception e){
            //todo 改为枚举类
            //4. 不通过
            response.setStatus(401);
            return false;
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //清理用户
        UserContext.removeUser();
    }
}
