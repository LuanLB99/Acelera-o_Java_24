package com.exercicio3.exercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);

			int number = 2;

			for (int i = 1; i <= 10; i++) {
				System.out.println(number + " x " + i + " = " + (number*i));
			}


	}

}
