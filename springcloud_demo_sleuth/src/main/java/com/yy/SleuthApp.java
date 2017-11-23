package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Description:
 * <p></p>
 * <pre></pre>
 * NB.
 * Created by skyler on 2017/11/23 at 下午11:32
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SleuthApp {

    public static void main(String[] args) {
        SpringApplication.run(SleuthApp.class, args);
    }
}
