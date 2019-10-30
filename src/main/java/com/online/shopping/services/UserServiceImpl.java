package com.online.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.online.shopping.dao.UserDao;
import com.online.shopping.model.Login;
import com.online.shopping.model.User;

public class UserServiceImpl implements UserService{
	  @Autowired
	  public UserDao userDao;
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		 return userDao.validateUser(login);
	}

}
