package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class UserApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(UserApplication.class, args);
		System.out.println("User service is running.,");
	}
	
	@Bean
	public RestTemplate getBean()
	{
		return new RestTemplate();
	}

}
