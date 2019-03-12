package com.yy.controller;

import com.yy.service.ComputeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URISyntaxException;


@RestController
public class EmployeeController {

	@SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getZone" ,method = RequestMethod.GET)
    public String getZone() {
        return restTemplate.getForEntity("http://SERVICE1/zone", String.class).getBody();
    }
    
    @Resource
    private ComputeService computeService;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() throws URISyntaxException {
    	return computeService.addService();
    }
}
