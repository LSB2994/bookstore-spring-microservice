package com.lsb.microservice.fromcrach;

import org.springframework.boot.SpringApplication;

public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(CatalogServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
