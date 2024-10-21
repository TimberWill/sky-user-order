package com.sky.user.mapper;

import com.sky.user.pojo.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 11:09
 **/
@Mapper
public interface DishFlavorMapper {
    List<DishFlavor> getDishFlavorById(BigInteger id);
}
