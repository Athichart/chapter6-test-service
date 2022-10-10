package com.example.chapter6testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Chapter6TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter6TestServiceApplication.class, args);
	}

}
