package com.example.springapp.Controllers;

import com.example.springapp.Services.Friday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class IndexController {

    @GetMapping("/helloSpring")
    public String helloEveryone() {

        return "Hello you <3";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String str) {

        return str;
    }

    @GetMapping("/isItFriday")
    public String isItFriday() {
        Friday fridayOrNah = new Friday();

        return fridayOrNah.isItFriday();
    }


}
