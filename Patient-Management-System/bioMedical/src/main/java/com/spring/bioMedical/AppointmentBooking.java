package com.spring.bioMedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@SpringBootApplication
@EnableAsync
public class AppointmentBooking {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentBooking.class, args);
	}

}
