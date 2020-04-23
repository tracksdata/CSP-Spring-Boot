package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.pricematrix" })
public class AppConfig {

	// call this method one time in object life cycle
	@Bean
	public void test() {
		System.out.println("--- Hello ..  test method");
	}

}
