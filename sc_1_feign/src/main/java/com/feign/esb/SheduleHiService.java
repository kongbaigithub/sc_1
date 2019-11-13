package com.feign.esb;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi")
public interface SheduleHiService {

	@RequestMapping("/hi")
	public String hi(@RequestParam("name") String name);
}
