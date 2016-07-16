package com.hulk.springboot.mybatis;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;

import com.hulk.springboot.model.User;

public class UserMapperProvider {
	public String insertUser(final User user) {
		return new SQL() {
			{
				INSERT_INTO("user");
				VALUES("username", "'" + user.getUsername() + "'");
				VALUES("password", "'" + user.getPassword() + "'");
			}
		}.toString();
	}

	public String insertALLBatch(List<User> users) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into user(username,password) values ");
		for (User user : users) {
			sb.append("('" + user.getUsername() + "','" + user.getPassword() + "'),");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
