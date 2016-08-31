package com.yy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yy.filter.ParamFilter;

@Configuration
public class AppConfig {

	@Bean
	public ParamFilter paramFilter(){
		return new ParamFilter();
	}
}
