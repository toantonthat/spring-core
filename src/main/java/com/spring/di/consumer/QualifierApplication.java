package com.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.di.services.MessageService;

@Component
public class QualifierApplication {
	private MessageService emailService;
	private MessageService twitterService;

	public MessageService getService() {
		return emailService;
	}

	@Autowired
	@Qualifier("emailService")
	public void setService(MessageService service) {
		this.emailService = service;
	}

	public MessageService getTwitterService() {
		return twitterService;
	}

	@Autowired
	@Qualifier("twitterService")
	public void setTwitterService(MessageService twitterService) {
		this.twitterService = twitterService;
	}

	public boolean emailProcessMessage(String msg, String rec) {
		return this.emailService.sendMessage(msg, rec);
	}

	public boolean twitterProcessMessage(String msg, String rec) {
		return this.twitterService.sendMessage(msg, rec);
	}
}
