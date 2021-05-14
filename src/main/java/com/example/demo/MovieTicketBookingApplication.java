package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.*"})
public class MovieTicketBookingApplication {//Change Class name

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingApplication.class, args);//Change Class name
	}

}