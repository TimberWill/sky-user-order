package com.sky.user.service.impl;

import com.sky.user.mapper.AddressBookMapper;
import com.sky.user.pojo.entity.AddressBook;
import com.sky.user.service.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-21 15:00
 **/
@Service
@Slf4j
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private AddressBookMapper addressBookMapper;

    public int insertAddressBook(AddressBook addressBook) {
        //todo: 获取当前userId
        int insert = addressBookMapper.insertAddressBook(addressBook);

        return insert;
    }

    public List<AddressBook> getlist(int userId) {
        List<AddressBook> addressBookList  = addressBookMapper.getAddressBookList(userId);
        return addressBookList;
    }

    public int updateAddressBook(AddressBook addressBook) {
        return addressBookMapper.updateAddressBook(addressBook);
    }

    public int deleteById(int id) {

        return addressBookMapper.deleteById(id);
    }

    public AddressBook getAddressBookById(int id) {

        return addressBookMapper.getAddressBookById(id);
    }

    public void setDefaultAddress(int id) {
        addressBookMapper.setDefault(id);
    }
}
