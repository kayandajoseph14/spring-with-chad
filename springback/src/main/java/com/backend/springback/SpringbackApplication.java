package com.backend.springback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.backend.springback",
							"util"}
)
public class SpringbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbackApplication.class, args);
	}

}
