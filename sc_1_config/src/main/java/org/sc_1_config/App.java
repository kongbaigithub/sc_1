package org.sc_1_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class App 
{
    public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
