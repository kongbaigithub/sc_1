package com.feign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feign.esb.SheduleHiService;
import com.feign.service.IHiService;

@Service
public class HiServiceImpl implements IHiService {
	
	@Autowired
	private SheduleHiService sheduleHiService;
	
	@Override
	public String hi(String name) {
		return sheduleHiService.hi(name);
	}

}
