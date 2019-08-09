package com.joeknowles.Db4FreeTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Db4FreeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Db4FreeTestApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	}

}