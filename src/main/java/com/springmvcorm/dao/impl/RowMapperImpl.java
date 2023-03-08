package com.springmvcorm.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvcorm.entity.User;

/*
 * This class is created for understaing how rowmapper will work.
 * From here we are going to set data to our employee entity or class fileds.
 * 
 */
public class RowMapperImpl implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setEmail(rs.getString(3));
		return user;
	}
}
