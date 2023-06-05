package com.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorDemoApplication.class, args);
		System.out.println("hello world");
	}

}
