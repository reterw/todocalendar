package com.reter.todocalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TodocalendarApplication {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context = SpringApplication.run(TodocalendarApplication.class, args);
		// RestTemplate restTemplate = (RestTemplate)context.getBean("restTemplate");
		// System.out.println(restTemplate);
		// System.out.println("hello");


		SpringApplication.run(TodocalendarApplication.class, args);
		System.out.println("success");

	}

}
