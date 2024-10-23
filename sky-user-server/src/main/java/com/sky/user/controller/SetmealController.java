package com.sky.user.controller;

import com.sky.common.pojo.result.Result;
import com.sky.user.pojo.entity.Setmeal;
import com.sky.user.pojo.vo.DishVO;
import com.sky.user.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: sky-user-order
 * @description: 套餐浏览
 * @author: whl
 * @create: 2024-10-21 16:17
 **/
@Slf4j
@RestController
@RequestMapping("/user/setmeal")
public class SetmealController {
    @Autowired
    private SetmealService setMealService;


    /**
     * 根据分类id查询套餐
     * @param categoryId
     * @return
     */
    @GetMapping("/list")
    public Result<List<Setmeal>> getList(int categoryId){
        List<Setmeal> setMealList = setMealService.getListByCategoryId(categoryId);
        return Result.success();
    }

    @GetMapping("/dish/")
    public Result<List<DishVO>> getDishListBySealMeal(int setmealId){
        List<DishVO> dishList = setMealService.getListBySetmealId(setmealId);

        return Result.success(dishList);
    }

}
