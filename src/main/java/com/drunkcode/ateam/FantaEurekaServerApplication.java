package com.drunkcode.ateam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FantaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantaEurekaServerApplication.class, args);
	}

}
