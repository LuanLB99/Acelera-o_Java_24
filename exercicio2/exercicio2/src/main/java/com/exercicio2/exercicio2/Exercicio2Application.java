package com.exercicio2.exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);

		//loop que vai iterar sobre o tamanho da sequencia
		//salvar o primeiro numero que vai ser 0  (variável numero anterior)
		// salvar variavel de contagem
		int antNumber = 0;
		int resultNumber = 0;

		for (int i = 0; i < 5; i++) {

			int result = antNumber + resultNumber;
			

			if(result == 0){
				resultNumber += 1;
			}

			

			System.out.print(result);
		}
	}

}
