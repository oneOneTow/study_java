package com.vens.study.mapper;


import com.vens.study.pojo.User;

import java.util.List;

public interface UserMapper {
    int add(User user);

    List<User> getByPhone(String phone);

    User getById(int id);

    void updateUser(User user);

}
