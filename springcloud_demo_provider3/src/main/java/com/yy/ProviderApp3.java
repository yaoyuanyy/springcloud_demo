package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApp {

	public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApp.class).web(true).run(args);
	}

}
