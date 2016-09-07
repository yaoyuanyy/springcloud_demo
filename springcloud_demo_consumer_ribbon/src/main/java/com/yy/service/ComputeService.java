package com.yy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ComputeService {
	//private Random random = new Random();
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String addService() {
		return restTemplate.getForEntity("http://SERVICE1/add?a=10&b=20", String.class).getBody();
		/*int randomInt = random.nextInt(10);
		if (randomInt < 8) { // 模拟调用失败情况
			throw new RuntimeException("call dependency service fail.");
		} else {
			return "UserName:liaokailin;number:" + randomInt;
		}*/
	}

	public String addServiceFallback() {
		return "error";
	}
}
