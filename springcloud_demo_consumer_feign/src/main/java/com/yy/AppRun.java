package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AppRun {

	public static void main(String[] args) {
        new SpringApplicationBuilder(AppRun.class).web(true).run(args);
        //SpringApplication.run(AppRun.class, args);
	}

}
