package com.sky.user.mapper;

import com.sky.user.pojo.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressBookMapper {
    int insertAddressBook(AddressBook addressBook);

    List<AddressBook> getAddressBookList(int userId);

    int updateAddressBook(AddressBook addressBook);

    int deleteById(int id);

    AddressBook getAddressBookById(int id);

    void setDefault(int id);
}
