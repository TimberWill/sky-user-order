package com.sky.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 15:05
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("address_book")
public class AddressBook {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 收货人
     */
    @TableField("consignee")
    private String consignee;

    /**
     * 性别
     */
    @TableField("sex")
    private String sex;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 省编号
     */
    @TableField("province_code")
    private String provinceCode;

    /**
     * 省名称
     */
    @TableField("province_name")
    private String provinceName;

    /**
     * 市编号
     */
    @TableField("city_code")
    private String cityCode;

    /**
     * 市名称
     */
    @TableField("city_name")
    private String cityName;

    /**
     * 区编号
     */
    @TableField("district_code")
    private String districtCode;

    /**
     * 区名称
     */
    @TableField("district_name")
    private String districtName;

    /**
     * 详细地址
     */
    @TableField("detail")
    private String detail;

    /**
     * 标签
     */
    @TableField("label")
    private String label;

    /**
     * 是否默认
     */
    @TableField("is_default")
    private Integer isDefault;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;
}
