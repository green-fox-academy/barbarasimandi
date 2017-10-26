package com.bean.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}
