package com.sky.user.service;

import com.sky.user.pojo.entity.AddressBook;

import java.util.List;

public interface AddressBookService {
    int insertAddressBook(AddressBook addressBook);

    List<AddressBook> getlist(int userId);

    int updateAddressBook(AddressBook addressBook);

    int deleteById(int id);

    AddressBook getAddressBookById(int id);

    void setDefaultAddress(int id);
}
