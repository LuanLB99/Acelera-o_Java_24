package com.exercicios6e7.exercicios6e7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicios6e7.exercicios6e7.entities.Holidays;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/holidays")
public class HolidaysController {
    
    @GetMapping()
    public HashMap<String, String> listHolidays() {
        return  Holidays.makeHolidays();
    }

    @GetMapping("/{date}")
    public String getHolidayByDate(@PathVariable String date) {
        return Holidays.getHolidayByDate(date);
    }
    
    
}
