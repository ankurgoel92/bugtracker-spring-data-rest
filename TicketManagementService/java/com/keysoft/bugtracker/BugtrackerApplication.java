package com.keysoft.bugtracker;

import com.keysoft.bugtracker.domain.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan("com.keysoft")
public class BugtrackerApplication {

	public static void main(String... args) {
		SpringApplication.run(BugtrackerApplication.class, args);

	}
}
