package com.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootActuatorAdminServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorAdminServerDemoApplication.class, args);
	}

}
