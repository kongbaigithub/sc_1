package com.hi.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hi.service.IHiService;

@Service
public class HiServiceImpl implements IHiService {

	@Value("${server.port}")
	private String port;
	
	@Override
	public String hi(String name) {
		return "hi "+ name +", i am port: " + port;
	}

}
