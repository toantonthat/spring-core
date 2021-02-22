package com.spring.di.services;

import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.custom.Component;

@Component
@Qualifier("emailService")
public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email message Sent to " + rec + " with Message=" + msg);
		return true;
	}

}
