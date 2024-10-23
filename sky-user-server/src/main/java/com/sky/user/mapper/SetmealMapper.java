package com.sky.user.mapper;

import com.sky.user.pojo.entity.Setmeal;
import com.sky.user.pojo.vo.DishVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealMapper {
    List<Setmeal> getList(int categoryId);

    List<DishVO> getDishList(int setmealId);
}
