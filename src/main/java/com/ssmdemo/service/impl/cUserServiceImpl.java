package com.ssmdemo.service.impl;

import com.ssmdemo.dao.IUserDao;
import com.ssmdemo.dao.IcUserDao;
import com.ssmdemo.model.User;
import com.ssmdemo.model.cUser;
import com.ssmdemo.service.IUserService;
import com.ssmdemo.service.IcUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("cuserService")
public class cUserServiceImpl implements IcUserService {
    @Resource
    private IcUserDao cuserDao;


    public boolean creatcUser(cUser cUser) {
        return false;
    }

    public boolean deletecUser(cUser cUser) {
        return false;
    }

    public boolean updatecUser(cUser cUser) {
        return false;
    }

    public cUser selectcUser(int userId) {
         return cuserDao.selectcUser(userId);
    }
}

