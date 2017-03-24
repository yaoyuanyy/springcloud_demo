package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@EnableDiscoveryClient
public class AppRun {

	public static void main(String[] args) {
		System.out.println();
		new SpringApplicationBuilder(AppRun.class).web(true).run(args);
	}

}
