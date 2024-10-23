package com.sky.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 16:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("setmeal")
public class Setmeal {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    /**
     * 分类id
     */
    @TableField("category_id")
    private BigInteger categoryId;

    /**
     * 套餐名称
     */
    @TableField("name")
    private String name;

    /**
     * 太惨价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 图像
     */
    @TableField("image")
    private String image;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    @TableField("create_user")
    private BigInteger createUser;

    /**
     * 修改人
     */
    @TableField("update_user")
    private BigInteger updateUser;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;
}
