package com.exercicio5.exercicio5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio5Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio5Application.class, args);

		String[] frutas1 = new String[]{"Morango", "Banana", "Maçã", "Uva", "Caqui"};
		String[] frutas2 =  new String[]{"Manga", "Caqui", "Morango", "Amora"};

		for (int i = 0; i < frutas1.length; i++) {

			for (int j = 0; j < frutas2.length; j++) {
				if(frutas1[i].equals(frutas2[j])){
					System.out.println(frutas1[i]);
				}
			}
		}
	}

}
