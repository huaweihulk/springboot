package com.hulk.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hulk.springboot.model.User;
import com.hulk.springboot.service.SpringBootService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {
	@Autowired
	private SpringBootService springBootService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		springBootService.printName();
		springBootService.withAopService();
		System.out.println(springBootService.findAllUser());
		springBootService.insertUserProvider(new User("caoyang", "123456"));
		 List<User> users = new ArrayList<User>();
		 for (int i = 0; i < 10000; i++) {
		 users.add(new User("coayang" + i, "123456" + i));
		 }
		 long start = System.currentTimeMillis();
		 springBootService.insertUsersProvider(users);
		 long end = System.currentTimeMillis();
		 System.out.println("batch cost:" + (end - start) / 1000);
		 start = System.currentTimeMillis();
//		 for (User user : users) {
//		 springBootService.insertUserProvider(user);
//		 }
//		 end = System.currentTimeMillis();
//		 System.out.println("batch cost:" + (end - start) / 1000);
	}
}
