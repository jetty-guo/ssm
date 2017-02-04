package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {


    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
    
	@Resource
    private UserMapper userDao;

}
