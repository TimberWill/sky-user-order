package com.sky.user.mapper;

import com.sky.user.pojo.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    String getNameById(Integer categoryId);


    List<Category> getCategoryListByType(Integer type);

}
