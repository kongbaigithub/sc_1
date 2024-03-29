package com.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HiApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HiApp.class, args);
	}
}
