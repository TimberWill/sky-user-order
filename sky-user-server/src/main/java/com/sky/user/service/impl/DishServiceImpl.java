package com.sky.user.service.impl;

import com.sky.user.mapper.CategoryMapper;
import com.sky.user.mapper.DishMapper;
import com.sky.user.pojo.entity.Dish;
import com.sky.user.pojo.entity.DishFlavor;
import com.sky.user.pojo.item.DishesAndFlavorsItem;
import com.sky.user.pojo.vo.DishFlavorVO;
import com.sky.user.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    // todo: 考虑list回参时，要考虑默认顺序问题，并且要考虑是否分页
    public List<DishFlavorVO> getListByCategoryId(Integer categoryId) {
        //1. 获取categoryName
        String categoryName = categoryMapper.getNameById(categoryId);

        //2. 获取所有的dishes
        List<DishFlavorVO> dishFlavorVOS = dishMapper.getDishes(categoryId);
        //2.1 获取所有的dish_id
        List<BigInteger> dishIds = dishFlavorVOS.stream().map(DishFlavorVO::getId).collect(Collectors.toList());

        //3.获得所有的dish_flavor
        List<DishFlavor> dishFlavors = dishMapper.selectFlavorsByDishIdList(dishIds);
        //3.1 聚合dish和dish_flavor
        Map<BigInteger, List<DishFlavor>> flavorsMap = dishFlavors.stream().collect(Collectors.groupingBy(DishFlavor::getDishId));
        for (DishFlavorVO dishFlavorVO : dishFlavorVOS) {
            dishFlavorVO.setFlavors(flavorsMap.get(dishFlavorVO.getId()));
            dishFlavorVO.setCategoryName(categoryName);
        }

//        //1. 根据categoryId查categoryName
//        String categoryName = categoryMapper.getNameById(categoryId);
//
//        //2. 先查出dishes，获取所有的id
//
//        List<DishesAndFlavorsItem> dishes = dishMapper.getDishesAndFlavors(categoryId);
//        List<DishFlavorVO> dishFlavorVOS = new ArrayList<>();
//
//        //3. 获取所有的dish_flavor
//        Map<BigInteger, List<DishesAndFlavorsItem>> collect = dishes.stream().collect(Collectors.groupingBy(DishesAndFlavorsItem::getFDishId));
//        for (Map.Entry<BigInteger, List<DishesAndFlavorsItem>> entry : collect.entrySet()) {
//            List<DishFlavor> dishFlavors = new ArrayList<>();
//            BigInteger dishId = entry.getKey();
//            List<DishesAndFlavorsItem> dishesAndFlavorsItems = entry.getValue();
//            for (DishesAndFlavorsItem dishesAndFlavorsItem : dishesAndFlavorsItems) {
//                DishFlavor dishFlavor = new DishFlavor();
//                BigInteger fId = dishesAndFlavorsItem.getFId();
//                String fValue = dishesAndFlavorsItem.getFValue();
//                String fName = dishesAndFlavorsItem.getFName();
//                BigInteger fDishId = dishesAndFlavorsItem.getFDishId();
//                dishFlavor.setId(fId);
//                dishFlavor.setValue(fValue);
//                dishFlavor.setName(fName);
//                dishFlavor.setDishId(fDishId);
//                dishFlavors.add(dishFlavor);
//            }
//            DishFlavorVO dishFlavorVO = new DishFlavorVO();
//            dishFlavorVO.setFlavors(dishFlavors);
//            dishFlavorVO.setId(dishId);
//            //其他属性
//            dishFlavorVOS.add(dishFlavorVO);
//        }

        return dishFlavorVOS;
    }
}
