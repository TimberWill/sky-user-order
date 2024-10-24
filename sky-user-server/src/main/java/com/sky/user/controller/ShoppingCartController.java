package com.sky.user.controller;

import com.sky.common.pojo.result.Result;
import com.sky.user.pojo.entity.ShoppingCart;
import com.sky.user.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: sky-user-order
 * @description: 购物车模块
 * @author: whl
 * @create: 2024-10-24 11:45
 **/
@Slf4j
@RestController
@RequestMapping("/user/shoppingCart")
public class ShoppingCartController {

    @Resource
    private ShoppingCartService shoppingCartService;

    /**
     * 查看购物车列表
     * @return
     */
    @GetMapping("/list")
    public Result<List<ShoppingCart>> getShoppingCartList(){
        log.info("调用查询购物车列表接口>>>>>>>>>>>>>");
        List<ShoppingCart> shoppingCartList = shoppingCartService.getList();

        return Result.success(shoppingCartList);
    }


}
