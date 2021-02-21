package com.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.di.services.MessageService;

@Component
public class MessageApplication {

	private MessageService service;

	public MessageService getService() {
		return service;
	}

	@Autowired
	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}
}
