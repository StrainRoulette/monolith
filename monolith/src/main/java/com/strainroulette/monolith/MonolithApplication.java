package com.strainroulette.monolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MonolithApplication {

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello World!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MonolithApplication.class, args);
	}

}
