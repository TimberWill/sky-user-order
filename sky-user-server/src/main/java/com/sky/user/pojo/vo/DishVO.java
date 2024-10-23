package com.sky.user.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-23 14:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DishVO {
    /**
     * 份数
     */
    private Integer copies;

    /**
     * 菜品描述
     */
    private String description;

    /**
     * 菜品图片
     */
    private String image;

    /**
     * 菜品名称
     */
    private String name;
}
