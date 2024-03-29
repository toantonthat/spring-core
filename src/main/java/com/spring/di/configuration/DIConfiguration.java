package com.spring.di.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.services.EmailService;
import com.spring.di.services.MessageService;
import com.spring.di.services.TwitterService;

@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@ComponentScan(value = { "com.spring.di" })
public class DIConfiguration {
	@Bean
	public MessageService getTwitterService() {
		System.out.println("@Twitter");
		return new TwitterService();
	}

	@Bean
	public MessageService getEmailService() {
		System.out.println("@Email");
		return new EmailService();
	}
}
