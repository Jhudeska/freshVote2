package com.example.freshVote2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("domain")
@SpringBootApplication
public class FreshVote2Application {

	public static void main(String[] args) {
		SpringApplication.run(FreshVote2Application.class, args);
	}

}
