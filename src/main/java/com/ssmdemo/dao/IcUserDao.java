package com.ssmdemo.dao;

import com.ssmdemo.model.cUser;

public interface IcUserDao {


    cUser selectcUser(int id);

    boolean createcUser(cUser user);

    boolean deletecUser(cUser user);

    boolean updatecUser(cUser user);


}
