package com.yy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${zone.name}")
    private String zoneName;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {

        System.out.println("provider1 zoneName:" + zoneName);

        List<ServiceInstance> instance = discoveryClient.getInstances("service1");
        instance.forEach(o -> {
            logger.info("host:{} serviceId:{} url:{} port:{} isSecure:{}", o.getHost(), o.getServiceId(), o.getUri(), o.getPort(), o.isSecure());
        });
        Integer r = a + b;
        logger.info("/add, result:{}", r);

        return r;
    }

    @RequestMapping(value = "/zone", method = RequestMethod.GET)
    public String zone() {
        return zoneName;
    }

}
