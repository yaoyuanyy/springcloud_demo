package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class AppRun {

	public static void main(String[] args) {
		//boolean cloudEnvironment = new StandardEnvironment().acceptsProfiles("cloud");
		new SpringApplicationBuilder(AppRun.class).web(true).run(args);
	}
}
