package com.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class UserManagementApplication {

	public static void main(String... args) {
		SpringApplication.run(UserManagementApplication.class, args);

	}
}
