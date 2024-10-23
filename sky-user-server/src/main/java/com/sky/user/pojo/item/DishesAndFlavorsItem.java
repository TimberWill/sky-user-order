package com.sky.user.pojo.item;

import lombok.Data;

import java.math.BigInteger;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-22 21:54
 **/
@Data
public class DishesAndFlavorsItem {
    private BigInteger id;               // d.id AS id
    private String name;              // d.name AS name
    private String description;       // d.description AS description
    private String image;             // d.image AS image
    private Double price;             // d.price AS price
    private Integer status;           // d.status AS status
    private String updateTime;        // d.update_time AS updateTime
    private Integer categoryId;       // d.category_id AS categoryId
    private BigInteger fDishId;          // df.dish_id AS f_dishId
    private BigInteger fId;              // df.id AS f_id
    private String fName;             // df.name AS f_name
    private String fValue;            // df.value AS f_value

}
