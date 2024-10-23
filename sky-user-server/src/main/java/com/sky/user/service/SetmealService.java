package com.sky.user.service;

import com.sky.user.pojo.entity.Setmeal;
import com.sky.user.pojo.vo.DishVO;

import java.util.List;

public interface SetmealService {
    List<Setmeal> getListByCategoryId(int categoryId);

    List<DishVO> getListBySetmealId(int setmealId);
}
