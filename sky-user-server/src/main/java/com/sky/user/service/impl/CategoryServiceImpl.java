package com.sky.user.service.impl;

import com.sky.user.mapper.CategoryMapper;
import com.sky.user.pojo.entity.Category;
import com.sky.user.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> getCategoryListByType(Integer type) {
        try {
           return  categoryMapper.getCategoryListByType(type);
        }catch (Exception e){
            log.info("获取 种类标签 失败！ >>>>>>>>>>>>>>>>>>>>>>> ", e);
            return null;
        }
    }


}
