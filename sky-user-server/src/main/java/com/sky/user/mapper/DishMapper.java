package com.sky.user.mapper;

import com.sky.user.pojo.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishMapper {

    List<Dish> getDishByCategoryId(Integer categoryId);
}
