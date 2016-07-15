package com.hulk.springboot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpringBootServiceAop {
	@Before("execution(* com.hulk..*service.*.withAop*(..))")
	public void beforeMetod() {
		System.out.println("BeforeMethod...");
	}
}
