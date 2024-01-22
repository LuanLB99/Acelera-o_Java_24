package com.exercicios6e7.exercicios6e7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercicios6e7.exercicios6e7.entities.Holidays;

@SpringBootApplication
public class Exercicios6e7Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios6e7Application.class, args);

 
		final String holiday = Holidays.getHolidayByDate("11-02-2024");
		System.out.println(holiday);

	}

}
