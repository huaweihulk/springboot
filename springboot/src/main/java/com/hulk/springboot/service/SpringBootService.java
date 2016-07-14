package com.hulk.springboot.service;

import org.springframework.stereotype.Service;

@Service(value = "springBootService")
public class SpringBootService {
	public void serviceOne() {
		System.out.println("service one");
	}
}
