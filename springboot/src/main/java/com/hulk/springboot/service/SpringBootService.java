package com.hulk.springboot.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hulk.springboot.util.LogUtils;

@Component
public class SpringBootService {
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
}
