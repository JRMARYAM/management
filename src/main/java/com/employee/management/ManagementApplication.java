package com.employee.management;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.employee.management")
public class ManagementApplication {

	static final Logger logger = LogManager.getLogger(ManagementApplication.class.getName());

	public static void main(String[] args) {

		logger.info("entered application");

		SpringApplication.run(ManagementApplication.class, args);
	}

}
