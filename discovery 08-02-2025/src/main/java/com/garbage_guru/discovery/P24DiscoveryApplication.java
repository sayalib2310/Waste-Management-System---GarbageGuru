package com.garbage_guru.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class P24DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(P24DiscoveryApplication.class, args);
	}

}
