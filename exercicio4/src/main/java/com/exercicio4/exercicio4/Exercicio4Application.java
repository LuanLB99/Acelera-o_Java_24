package com.exercicio4.exercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio4Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio4Application.class, args);
		int number = 5;

		for (int l = 1; l <= number; l++) {
			for (int c = 0; c < l; c++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
