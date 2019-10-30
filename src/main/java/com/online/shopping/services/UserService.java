package com.online.shopping.services;

import com.online.shopping.model.Login;
import com.online.shopping.model.User;

public interface UserService {
	void register(User user);

    User validateUser(Login login);
}
