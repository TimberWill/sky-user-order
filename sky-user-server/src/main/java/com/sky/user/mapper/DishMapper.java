package com.sky.user.mapper;

import com.sky.user.pojo.entity.Dish;
import com.sky.user.pojo.entity.DishFlavor;
import com.sky.user.pojo.item.DishesAndFlavorsItem;
import com.sky.user.pojo.vo.DishFlavorVO;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface DishMapper {

    List<DishesAndFlavorsItem> getDishesAndFlavors(Integer categoryId);

    List<DishFlavorVO> getDishes(Integer categoryId);

    List<DishFlavor> selectFlavorsByDishIdList(List<BigInteger> dishIds);
}
