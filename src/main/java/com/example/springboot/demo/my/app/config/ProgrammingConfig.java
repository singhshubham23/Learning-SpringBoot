package com.example.springboot.demo.my.app.config;

import com.example.springboot.demo.my.app.commom.CInstructor;
import com.example.springboot.demo.my.app.commom.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammingConfig {
    @Bean
    public Instructor cInstructor(){
        return new CInstructor();
    }
}
