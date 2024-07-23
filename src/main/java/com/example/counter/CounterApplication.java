package com.example.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CounterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CounterApplication.class, args);
	}

}
