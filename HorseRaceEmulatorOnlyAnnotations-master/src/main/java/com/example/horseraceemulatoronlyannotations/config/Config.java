package com.example.horseraceemulatoronlyannotations.config;


import com.example.horseraceemulatoronlyannotations.beans.Horse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public List<Horse> getHorses() {
        List<Horse> horseList = new ArrayList<>();
        Horse horse1 = new Horse("Arabic", 1, "Ahmed");
        Horse horse2 = new Horse("England", 2, "Tomy");
        Horse horse3 = new Horse("Scottish", 3, "Jerry");
        Horse horse4 = new Horse("Zealander", 4, "Harry");
        Horse horse5 = new Horse("Poni", 5, "Boni");
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
        horseList.add(horse4);
        horseList.add(horse5);
        return horseList;
    }
}
