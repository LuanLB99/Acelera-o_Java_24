package com.exerciciosjava.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VerifyVariable {

	public static void main(String[] args) {
		SpringApplication.run(VerifyVariable.class, args);
			
		System.out.println(Variable.getTypeNumber(2));
		System.out.println(Variable.getTypeNumber(-5));
		System.out.println(Variable.getTypeNumber(-10));

	}

}
