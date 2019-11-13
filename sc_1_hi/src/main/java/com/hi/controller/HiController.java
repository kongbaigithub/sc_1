package com.hi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hi.service.IHiService;

@RestController
public class HiController {

	@Autowired
	private IHiService hiservice;
	
	@RequestMapping("/hi")
	public String hi(@RequestParam("name") String name) {
		return hiservice.hi(name);
	}
}
