package com.ballejos.mywebsiteback;

import com.ballejos.mywebsiteback.entity.EmailDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ballejos.mywebsiteback.service.MailService;


@SpringBootApplication
public class MyWebsiteBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebsiteBackApplication.class, args);

	}

}
