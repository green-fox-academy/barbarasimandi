package com;

import com.bean.hello.HelloWorld;
import com.bean.hello.HelloWorldConfig;
import com.greenfox.colors.GreenColor;
import com.greenfox.colors.MyColor;
import com.greenfox.colors.MyColorConfig;
import com.greenfox.colors.RedColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

		ApplicationContext helloCtx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = helloCtx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		ApplicationContext colorCtx = new AnnotationConfigApplicationContext(MyColorConfig.class);

		MyColor redColor = colorCtx.getBean(RedColor.class);
		MyColor greenColor = colorCtx.getBean(GreenColor.class);

		redColor.printColor();
		greenColor.printColor();
	}
}
