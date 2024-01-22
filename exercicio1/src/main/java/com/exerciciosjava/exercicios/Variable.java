package com.exerciciosjava.exercicios;


public class Variable {

    
    public static String getTypeNumber(int number){
        
        return number + " é " + isByOrImpar(number) + " e " + isPositiveOrNegative(number);
    }

    private static String isPositiveOrNegative(int number){
        if(number >= 0){
            return "Positivo";
        } return "Negativo";
    }

    private static String isByOrImpar(int number){
        if(number % 2 == 0){
            return "Par";
        } return "Ímpar";
    }

}
