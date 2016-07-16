package com.hulk.springboot.mybatis;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hulk.springboot.SpringBootApp;
import com.hulk.springboot.model.User;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringBootApp.class)
public class UserMapperProviderTest {
	@Autowired
	private UserMapperProvider userMapperProvicer;

	@Test
	public void testProviderInsertAll() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			users.add(new User("coayang" + i, "123456" + i));
		}
		userMapperProvicer.insertALLBatch(users);
	}

}
