package com.madtheif.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsdemoApplication.class, args);
	}
}
