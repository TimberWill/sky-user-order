package com.sky.user.service;

import com.sky.user.pojo.vo.DishFlavorVO;

import java.util.List;

public interface DishService {
    List<DishFlavorVO> getListByCategoryId(Integer categoryId);
}
