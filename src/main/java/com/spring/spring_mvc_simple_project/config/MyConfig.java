package com.spring.spring_mvc_simple_project.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.spring_mvc_simple_project")
public class MyConfig {

	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		
		return Persistence.createEntityManagerFactory("ansari");
	}

}
