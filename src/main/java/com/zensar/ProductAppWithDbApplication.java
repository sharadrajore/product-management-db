package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductAppWithDbApplication {

	public static void main(String[] args) {
		System.out.println("Code Pipeline");
		SpringApplication.run(ProductAppWithDbApplication.class, args);
	}

}
