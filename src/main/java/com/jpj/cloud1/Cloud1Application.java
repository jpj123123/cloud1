package com.jpj.cloud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Cloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloud1Application.class, args);
	}
}
