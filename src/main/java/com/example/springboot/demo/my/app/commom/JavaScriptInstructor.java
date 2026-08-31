package com.example.springboot.demo.my.app.commom;

import org.springframework.stereotype.Component;

@Component
public class JavaScriptInstructor implements Instructor{
    @Override
    public String getProgrammingExercise() {
        return "Write a program convert 120 min in seconds";
    }
}
