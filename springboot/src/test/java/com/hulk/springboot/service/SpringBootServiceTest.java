package com.hulk.springboot.service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hulk.springboot.SpringBootApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringBootApp.class)
public class SpringBootServiceTest {
	@Autowired
	private SpringBootService springBootService;
	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testServiceOne() {
		springBootService.printName();
		String output = outputCapture.toString();
		assertTrue(output.contains("cao"));
	}

}
