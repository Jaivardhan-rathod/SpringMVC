package com.springmvcorm.dao;

import java.util.List;

import com.springmvcorm.entity.User;

public interface UserDao {
	public int create(User user);
	public List<User> allUsers();
	
}
