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
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    /**
     * 类型
     */
    @TableField("type")
    private Integer type;

    /**
     * 分类名称
     */
    @TableField("name")
    private String name;

    /**
     * 顺序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 分类状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
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
