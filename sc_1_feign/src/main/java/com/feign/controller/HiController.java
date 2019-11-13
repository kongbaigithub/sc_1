package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feign.service.IHiService;

@RestController
public class HiController {
	
	@Autowired
	private IHiService hiService;

	@RequestMapping("/hi")
	public String hi(@RequestParam String name) {
		return hiService.hi(name);
	}
}
