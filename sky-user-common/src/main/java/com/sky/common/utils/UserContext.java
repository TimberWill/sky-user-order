package com.sky.common.utils;

/**
 * @program: sky-user-order
 * @description: 用户登录信息(存 userId)
 * @author: whl
 * @create: 2024-10-29 16:33
 **/
public class UserContext {
    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 获取用户信息
     * @return
     */
    public static Long getUser() {
        return threadLocal.get();
    }

    /**
     * 设置用户信息
     * @param userId
     */
    public static void setUser(Long userId){
        threadLocal.set(userId);
    }

    /**
     * 移除用户信息
     */
    public static void removeUser(){
        threadLocal.remove();
    }

}
