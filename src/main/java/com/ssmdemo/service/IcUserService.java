package com.ssmdemo.service;


import com.ssmdemo.model.cUser;

public interface IcUserService {

    public boolean creatcUser(cUser cUser);

    public boolean deletecUser(cUser cUser);

    public boolean updatecUser(cUser cUser);

    public cUser selectcUser(int userId);
}
