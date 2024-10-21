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

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-20 10:36
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("category")
public class Category{
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    @TableField("type")
    private Integer type;

    @TableField("name")
    private String name;

    @TableField("sort")
    private Integer sort;

    @TableField("status")
    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("create_user")
    private BigInteger createUser;

    @TableField("update_user")
    private BigInteger updateUser;
}
