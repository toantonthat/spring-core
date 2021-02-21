package com.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.di.configuration.DIConfiguration;
import com.spring.di.consumer.MessageApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MessageApplication app = context.getBean(MessageApplication.class);

		app.processMessage("Hi Pankaj", "pankaj@abc.com");

		// close the context
		context.close();
	}
}
