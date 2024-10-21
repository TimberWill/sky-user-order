package com.sky.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-20 09:39
 **/
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("dish_flavor")
public class DishFlavor {
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    private BigInteger dish_id;

    private String name;

    private String value;

}
