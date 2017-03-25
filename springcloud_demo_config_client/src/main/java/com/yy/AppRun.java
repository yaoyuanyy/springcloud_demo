package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRun {

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(AppRun.class, args);
		//new SpringApplicationBuilder(AppRun.class).web(true).run(args);
	}

}
