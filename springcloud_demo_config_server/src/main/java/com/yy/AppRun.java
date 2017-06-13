package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppRun {
	
	public static void main(String[] args) {
        new SpringApplicationBuilder(AppRun.class).web(true).run(args);
	}

}
