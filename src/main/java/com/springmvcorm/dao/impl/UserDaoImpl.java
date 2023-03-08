package com.springmvcorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvcorm.dao.UserDao;
import com.springmvcorm.entity.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public int create(User user) {
		String sql="insert into userdata values(?,?,?)";
		return jdbcTemplate.update(sql, user.getId(), user.getName(),user.getEmail());
	}

	public List<User> allUsers() {
		RowMapperImpl rowMapper = new RowMapperImpl();
		String sql="Select * from userdata";
		List<User> user = jdbcTemplate.query(sql, rowMapper);
		return user;
	}

}
