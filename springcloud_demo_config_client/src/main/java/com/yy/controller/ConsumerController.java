package com.yy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
@RefreshScope
@RestController
public class ConsumerController {

	@SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@Value("${from}")
	private String from;
	
    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String add() {
    	return from;
    }

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
    
    
}
