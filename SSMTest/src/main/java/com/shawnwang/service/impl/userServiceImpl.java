package com.shawnwang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shawnwang.dao.IUserDao;
import com.shawnwang.pojo.User;
import com.shawnwang.service.IUserService;

@Service("userService")
public class userServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override 
	public User getUserById(int userId){
		return this.userDao.selectByPrimaryKey(userId);
	}
}
