package com.example.test;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class SpringBootJsonDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsonDocsApplication.class, args);
	}

}
