package com.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.di.services.MessageService;

@Component
public class MessageApplication {

	private MessageService service;
	
	//private MessageService messageTwitterService;

	public MessageService getService() {
		return service;
	}

	@Autowired
	@Qualifier("emailService")
	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}

//	public MessageService getTwitterService() {
//		return messageTwitterService;
//	}
//
//	@Autowired
//	@Qualifier("twitterService")
//	public void setTwitterService(MessageService messageTwitterService) {
//		this.messageTwitterService = messageTwitterService;
//	}
	
	
}
