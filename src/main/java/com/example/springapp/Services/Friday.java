package com.example.springapp.Services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Friday {

    public String isItFriday() {

        LocalDate date = LocalDate.now();
        if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return "IT'S FRIDAY! WUHU! 😎";
        } else {
            return "it's not even close 💔";
        }
    }

}
