package com.sky.user.service.impl;

import com.sky.user.mapper.SetmealMapper;
import com.sky.user.pojo.entity.Setmeal;
import com.sky.user.pojo.vo.DishVO;
import com.sky.user.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 16:37
 **/
@Service
@Slf4j
public class SetmealServiceImpl implements SetmealService {

    @Resource
    private SetmealMapper setmealMapper;

    public List<Setmeal> getListByCategoryId(int categoryId) {
        // todo: 同样list回参考虑分页
        List<Setmeal> setMealList = setmealMapper.getList(categoryId);

        return setMealList;
    }

    public List<DishVO> getListBySetmealId(int setmealId) {
        List<DishVO> dishVOList = setmealMapper.getDishList(setmealId);

        return dishVOList;
    }
}
