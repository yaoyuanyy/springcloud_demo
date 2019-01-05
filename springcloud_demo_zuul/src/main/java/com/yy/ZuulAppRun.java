package com.yy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class ZuulAppRun {

	public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulAppRun.class).web(true).run(args);
	}

}
