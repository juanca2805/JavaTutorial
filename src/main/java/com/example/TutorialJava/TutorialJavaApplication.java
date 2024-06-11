package com.example.TutorialJava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialJavaApplication {

	private static Logger logger = LoggerFactory.getLogger(TutorialJavaApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(TutorialJavaApplication.class, args);
		logger.error("ta mal");
	}

}
