package com.spring.di.services;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class GreetingService {
    private static final Logger logger = Logger.getLogger(GreetingService.class.getName());

    public void greet() {
        logger.info("GreetingService is initialized");
    }
}
