package com.sky.user.controller;

import com.sky.common.pojo.result.Result;
import com.sky.user.pojo.entity.Category;
import com.sky.user.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 14:13
 **/
@RestController
@RequestMapping("/user/category")
@Slf4j
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping("/list")
    public Result<List<Category>> getList(@Nullable Integer type){

        List<Category> categoryList = categoryService.getCategoryListByType(type);

        return Result.success(categoryList);
    }

}
