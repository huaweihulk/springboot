package com.hulk.springboot.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hulk.springboot.model.User;
import com.hulk.springboot.mybatis.UserMapper;
import com.hulk.springboot.util.LogUtils;

@Component
public class SpringBootService {
	@Autowired
	private UserMapper userMapper;
	private static Logger logger = LogUtils.getLogger(SpringBootService.class);
	@Value(value = "${name}")
	private String MyName;

	public void printName() {
		logger.info(MyName);
		System.out.println(MyName);
	}

	public void withAopService() {
		System.out.println("AopService Method");
	}

	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

	public boolean insertUser() {
		return userMapper.insertUser(new User("zhuyun", "123456"));
	}

	public void insertUserProvider(User user) {
		userMapper.insertUserProvider(user);
	}

	public void insertUsersProvider(List<User> users) {
		userMapper.insertUserListProvider(users);
	}
}
