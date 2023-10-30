package com.example.msa2apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Msa2ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msa2ApiGatewayApplication.class, args);
	}

}
