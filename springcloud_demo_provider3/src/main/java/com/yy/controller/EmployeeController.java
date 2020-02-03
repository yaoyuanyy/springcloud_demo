package com.yy.controller;

import com.netflix.discovery.EurekaClient;
import com.yy.vo.TestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;


@RestController
@RequestMapping("/hello")
public class EmployeeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;
    
    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
      /*  InstanceInfo info = eurekaClient.getNextServerFromEureka("SERVICE2", false);
        logger.info(info.getHomePageUrl());*/
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

    @RequestMapping(value = "/create" ,method = RequestMethod.POST)
    public Integer create(Integer a, Integer b, @RequestBody TestVo testVo) {

        System.out.println("a:" + a + " b:" + b + "testVo:" + testVo);

        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
      /*  InstanceInfo info = eurekaClient.getNextServerFromEureka("SERVICE2", false);
        logger.info(info.getHomePageUrl());*/
        Integer r = a + b;
        logger.info("/create, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

}
