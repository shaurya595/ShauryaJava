package com.Geekster.ShauryaJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CustomConfiguration {
    @Bean

    public Student getStudent(){
        return new Student("virat");
    }
}
