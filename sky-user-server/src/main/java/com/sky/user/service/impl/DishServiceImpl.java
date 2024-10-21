package com.sky.user.service.impl;

import com.sky.user.mapper.CategoryMapper;
import com.sky.user.mapper.DishFlavorMapper;
import com.sky.user.mapper.DishMapper;
import com.sky.user.pojo.entity.Dish;
import com.sky.user.pojo.entity.DishFlavor;
import com.sky.user.pojo.vo.DishFlavorVO;
import com.sky.user.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-20 10:46
 **/
@Service
@Slf4j
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private DishFlavorMapper dishFlavorMapper;

    public List<DishFlavorVO> getListByCategoryId(Integer categoryId) {
        List<DishFlavorVO> dishFlavorVOS = new ArrayList<>();

        //1. category表：根据categoryId查name信息
        String categoryName = categoryMapper.getNameById(categoryId);
        log.info("查询到category name: {}", categoryName);

        //2. dish表：根据categoryId查description、id、image、name、price、status、update_time信息
        List<Dish> dishes = dishMapper.getDishByCategoryId(categoryId);
        log.info("查询到dish: {}", dishes);


        //3. dish_flavor表：根据2中查到的id，在表中查flavor的id、dishId、name、value信息
        for (Dish dish : dishes) {
            List<DishFlavor> dishFlavor = dishFlavorMapper.getDishFlavorById(dish.getId());
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            DishFlavorVO dishFlavorVO = DishFlavorVO.builder()
                    .categoryId(categoryId)
                    .categoryName(categoryName)
                    .description(dish.getDescription())
                    .id(dish.getId())
                    .image(dish.getImage())
                    .name(dish.getName())
                    .price(dish.getPrice())
                    .status(dish.getStatus())
                    .updateTime(dish.getUpdateTime().format(dateTimeFormatter))
                    .flavors(dishFlavor)
                    .build();
            dishFlavorVOS.add(dishFlavorVO);

        }

        return dishFlavorVOS;
    }
}
