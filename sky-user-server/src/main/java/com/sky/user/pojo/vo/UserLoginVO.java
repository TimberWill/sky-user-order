package com.sky.user.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-05 12:39
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginVO {
    private String token;
    private Long userId;
    private String username;
}
