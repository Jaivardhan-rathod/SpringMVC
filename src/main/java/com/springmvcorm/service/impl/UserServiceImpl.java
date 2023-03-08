package com.springmvcorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcorm.dao.UserDao;
import com.springmvcorm.entity.User;
import com.springmvcorm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}

	public List<User> allUser() {
		return userdao.allUsers();
	}
	
	
	
}
