package com.exercicios6e7.exercicios6e7.entities;

import java.util.HashMap;

public class Holidays {
    private String date;
    private String holiday;

    Holidays(String date, String holiday){
        this.date = date;
        this.holiday = holiday;
    }

   public static String getHolidayByDate(String date){
        HashMap<String,String> listHolidays = makeHolidays();
        String holiday = listHolidays.get(date);

        if(holiday == null){
            return "Dia " + date + " não é feriado :'(";
        }

        return "Dia " + date + " é " + holiday;
    }

    
   public static HashMap<String,String> makeHolidays(){
        HashMap<String, String> listHolidays = new HashMap<>();
        listHolidays.put("01-01-2024","Confraternização Mundial");
        listHolidays.put("12-02-2024","Carnaval");
        listHolidays.put("13-02-2024","Carnaval");
        listHolidays.put("29-03-2024","Sexta-feira Santa");
        listHolidays.put("21-04-2024","Tiradentes");
        listHolidays.put("01-05-2024","Dia do Trabalho");
        listHolidays.put("30-05-2024","Corpus Christi");
        listHolidays.put("07-09-2024","Independência do Brasil");
        listHolidays.put("12-10-2024","Nossa Senhora Aparecida");
        listHolidays.put("02-11-2024","Finados");
        listHolidays.put("15-11-2024","Proclamação da República");
        listHolidays.put("20-11-2024","Dia Nacional de Zumbi e da Consciência Negra");
        listHolidays.put("25-12-2024","Natal");

        return listHolidays;
    }
}
