package com.hulk.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}
