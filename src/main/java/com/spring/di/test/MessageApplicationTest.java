package com.spring.di.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.consumer.MessageApplication;
import com.spring.di.services.MessageService;

@Configuration
@ComponentScan(value = { "com.spring.di.consumer" })
public class MessageApplicationTest {

	private AnnotationConfigApplicationContext context = null;

	@Bean
	public MessageService getMessageService() {
		return new MessageService() {

			public boolean sendMessage(String msg, String rec) {
				System.out.println("Mock Service");
				return true;
			}

		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(MessageApplicationTest.class);
	}

	@Test
	public void test() {
		MessageApplication app = context.getBean(MessageApplication.class);
		System.out.println("app " + app);
		Assert.assertTrue(app.processMessage("Hi Pankaj", "pankaj@abc.com"));
	}

	public static void main(String[] args) {

	}
}
