package com.sky.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Category {
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    private Integer type;

    private String name;

    private Integer sort;

    private Integer status;

    private LocalDateTime create_time;

    private LocalDateTime update_time;

    private BigInteger create_user;

    private BigInteger update_user;
}
