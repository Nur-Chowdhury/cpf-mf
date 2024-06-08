package com.c.p;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PApplication {

	public static void main(String[] args) {
		String port = System.getenv("PORT");
        System.out.println("PORT environment variable: " + port);
		SpringApplication.run(PApplication.class, args);
	}

}
