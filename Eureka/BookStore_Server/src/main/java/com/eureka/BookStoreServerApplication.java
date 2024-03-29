package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BookStoreServerApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(BookStoreServerApplication.class, args);
		System.out.println("Eureka server is running.,");
	}

}
