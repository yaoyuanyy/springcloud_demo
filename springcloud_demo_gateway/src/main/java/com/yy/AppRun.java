package com.yy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringCloudApplication
@EnableZuulProxy
public class AppRun {

	public static void main(String[] args) {
        new SpringApplicationBuilder(AppRun.class).web(true).run(args);
	}

}
