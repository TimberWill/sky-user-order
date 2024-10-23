package com.sky.user.controller;

import com.sky.common.pojo.result.Result;
import com.sky.user.mapper.AddressBookMapper;
import com.sky.user.pojo.entity.AddressBook;
import com.sky.user.service.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 14:56
 **/
@RestController
@RequestMapping("/user/addressBook")
@Slf4j
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * 新增地址
     * @param addressBook
     * @return
     */
    @PostMapping("")
    public Result<String> insertAddressBook(AddressBook addressBook){
        log.info("调用新增地址接口:{}", addressBook);
        int insert = addressBookService.insertAddressBook(addressBook);
        if (insert == 1){
            return Result.success();
        }else {
            return Result.error("新增地址失败");
        }
    }


    /**
     * 获取当前登录用户的所有地址信息
     * @return
     */
    @GetMapping("/list")
    public Result<List<AddressBook>> getList(){
        //todo 获取当前登录用户的信息
        int userId  = 1;
        List<AddressBook> addressBookList = addressBookService.getlist(userId);

        return Result.success(addressBookList);
    }

    /**
     * 修改地址
     * @param addressBook
     * @return
     */
    @PutMapping("")
    public Result<String> updateAddressBook(AddressBook addressBook){
        int affectRows = addressBookService.updateAddressBook(addressBook);

        if (affectRows > 0){
            return Result.success();
        }else {
            return Result.error("修改地址失败");
        }
    }

    /**
     * 删除地址
     * @param id
     * @return
     */
    @DeleteMapping("")
    public Result<String> deleteById(int id){
        //此处是物理删除
        int affectRows = addressBookService.deleteById(id);
        if (affectRows > 0){
            return Result.success();
        }else {
            return Result.error("删除地址失败");
        }

    }

    /**
     * 根据id查询地址
     * @param id
     * @return
     */
    @GetMapping("")
    public Result<AddressBook> getById(int id){
        AddressBook addressBook = addressBookService.getAddressBookById(id);

        return Result.success(addressBook);
    }

    @PutMapping("/default")
    public Result<String> setDefaultAddress(int id){
        addressBookService.setDefaultAddress(id);

        return Result.success();
    }

}
