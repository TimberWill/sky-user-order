package com.sky.user.service;

import com.sky.user.pojo.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoryListByType(Integer type);

    List<Category> getCategoryList();

}
