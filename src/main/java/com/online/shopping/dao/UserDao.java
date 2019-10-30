package com.online.shopping.dao;

import com.online.shopping.model.Login;
import com.online.shopping.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}
