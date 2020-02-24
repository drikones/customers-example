package com.adriano.estudos.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomersExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersExampleApplication.class, args);
	}

}
