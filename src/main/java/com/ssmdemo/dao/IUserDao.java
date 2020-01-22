package com.ssmdemo.dao;

import com.ssmdemo.model.User;

public interface IUserDao {

    User selectUser(long id);
}
