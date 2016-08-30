package com.yy.server.comsumer;

import org.springframework.stereotype.Component;

@Component
public class HystixComputeClient implements ComputeClient {

	@Override
	public Integer add(Integer a, Integer b) {
		return -9999;
	}

}
