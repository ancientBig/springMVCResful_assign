package com.xaba.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AccentureMaRestfulSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccentureMaRestfulSpringApplication.class, args);
	}
}
