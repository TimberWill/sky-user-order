package com.sky.user.controller;

import com.sky.common.pojo.result.Result;
import com.sky.user.pojo.vo.DishFlavorVO;
import com.sky.user.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-18 15:55
 **/
@Slf4j
@RestController
@RequestMapping("/user/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("/list")
    public Result<List<DishFlavorVO>> getDishListById(Integer categoryId){
        List<DishFlavorVO> dishFlavorVO = dishService.getListByCategoryId(categoryId);

        return Result.success(dishFlavorVO);
    }

}
