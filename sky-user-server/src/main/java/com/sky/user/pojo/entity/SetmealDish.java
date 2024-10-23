package com.sky.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 16:53
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("setmeal_dish")
public class SetmealDish {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    /**
     * 套餐id
     */
    @TableField("setmeal_id")
    private BigInteger setmealId;

    /**
     * 菜品id
     */
    @TableField("dish_id")
    private BigInteger dishId;

    /**
     * 菜品名称
     */
    @TableField("name")
    private String name;

    /**
     * 价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 菜品份数
     */
    @TableField("copies")
    private Integer copies;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

}
