package com.hulk.springboot.aop;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hulk.springboot.model.User;
import com.hulk.springboot.mybatis.UserMapper;

@Aspect
@Component
public class SpringBootServiceAop {

	@Before("execution(* com.hulk..*service.*.withAop*(..))")
	public void beforeMetod() {
		System.out.println("BeforeMethod...");
	}

	@After("execution(* com.hulk..*service.*.withAop*(..))")
	public void afterMethod() {
		System.out.print("AfterMethod...");
	}

	@Around("execution(* com.hulk..*service.*.withAop*(..))")
	public void aroundMethod() {
		System.out.println("AroundMethod....");
	}

}
