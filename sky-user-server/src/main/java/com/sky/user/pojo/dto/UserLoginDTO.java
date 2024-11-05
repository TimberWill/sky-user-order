package com.sky.user.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-05 12:11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
