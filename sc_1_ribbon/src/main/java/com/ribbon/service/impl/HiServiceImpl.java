package com.ribbon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ribbon.service.IHiService;

@Service
public class HiServiceImpl implements IHiService{

	@Autowired
	private RestTemplate restTemplte;
	@Override
	public String hi(String name) {

		return restTemplte.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
	}

}
