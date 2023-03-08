package com.springmvcorm.service;

import java.util.List;

import com.springmvcorm.entity.User;

public interface UserService {
	int save(User user);
	List<User> allUser();
}
