package com.sky.user.pojo.vo;

import com.sky.user.pojo.entity.Dish;
import com.sky.user.pojo.entity.DishFlavor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-20 10:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DishFlavorVO {
    private Integer categoryId;

    private String categoryName;

    private String description;

    private List<DishFlavor> flavors;

    private BigInteger id;

    private String image;

    private String name;

    private BigDecimal price;

    private Integer status;

    private String updateTime;
}
