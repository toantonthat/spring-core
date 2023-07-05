package com.spring.di.services;

import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.custom.Component;

import javax.annotation.PostConstruct;

@Component
@Qualifier("twitterService")
public class TwitterService implements MessageService {

	@PostConstruct
	public void init() {
		System.out.println("------------------------------------------->");
	}

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to " + rec + " with Message=" + msg);
		return true;
	}

}
