package com.futurex.services.FutureXCourseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FutureXCourseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureXCourseAppApplication.class, args);
	}

}
