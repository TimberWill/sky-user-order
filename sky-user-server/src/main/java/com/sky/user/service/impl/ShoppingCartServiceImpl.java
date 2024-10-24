package com.sky.user.service.impl;

import com.sky.user.mapper.ShoppingCartMapper;
import com.sky.user.pojo.entity.ShoppingCart;
import com.sky.user.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-24 11:46
 **/
@Slf4j
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Resource
    private ShoppingCartMapper shoppingCartMapper;
    @Override
    public List<ShoppingCart> getList() {
        List<ShoppingCart> shoppingCarts = new ArrayList<>();
        try {
            shoppingCarts = shoppingCartMapper.getList();
        }catch (Exception e){
            log.info("查看购物车列表失败>>>>>>>>>>>>>>>>>>");
        }

        return shoppingCarts;
    }
}
