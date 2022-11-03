package com.example.MyBookShopApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class MyBookShopAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBookShopAppApplication.class, args);
	}

}
