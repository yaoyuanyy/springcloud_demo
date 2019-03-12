package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterNode3 {
	public static void main(String[] args) {
		//SpringApplication.run(AppRun.class, args);
        new SpringApplicationBuilder(EurekaClusterNode3.class).web(true).run(args);

	}
}

