package com.paymentchain.springadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableScheduling
@EnableAdminServer
public class SpringadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringadminApplication.class, args);
	}

}
