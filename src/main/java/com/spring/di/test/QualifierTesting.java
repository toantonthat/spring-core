package com.spring.di.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.consumer.QualifierApplication;
import com.spring.di.services.EmailService;
import com.spring.di.services.MessageService;
import com.spring.di.services.TwitterService;

@Configuration
@ComponentScan(value = { "com.spring.di.consumer" })
public class QualifierTesting {
	
	private AnnotationConfigApplicationContext context = null;
	
	@Bean(name="emailService")
	public MessageService getEmailService() {
        return new EmailService();
    }
	
	@Bean(name="twitterService")
	public MessageService getTwitterService() {
        return new TwitterService();
    }
	
	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(QualifierTesting.class);
	}
	
	@Test
	public void test() {
		QualifierApplication app = context.getBean(QualifierApplication.class);
		System.out.println("app " + app);
		Assert.assertTrue(app.twitterProcessMessage("Hi Pankaj", "pankaj@abc.com"));
	}
}
