package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterAppRun {
	public static void main(String[] args) {
		//SpringApplication.run(AppRun.class, args);
        new SpringApplicationBuilder(RegistryCenterAppRun.class).web(true).run(args);

		System.out.println("hi");

	}
}

