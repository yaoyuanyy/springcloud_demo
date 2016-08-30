package com.yy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yy.server.comsumer.ComputeClient;

 
@RestController
public class ConsumerController {


    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add() {
        /*ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;*/
        return computeClient.add(1, 2);

    }

}
