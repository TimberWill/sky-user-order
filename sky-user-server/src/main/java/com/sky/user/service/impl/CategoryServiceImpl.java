package com.sky.user.service.impl;

import com.sky.user.mapper.CategoryMapper;
import com.sky.user.pojo.entity.Category;
import com.sky.user.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 14:18
 **/
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> getCategoryListByType(Integer type) {
        return categoryMapper.getListByType(type);
    }

    public List<Category> getCategoryList() {
        return categoryMapper.getList();
    }


}
