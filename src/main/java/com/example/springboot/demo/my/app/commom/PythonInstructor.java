package com.example.springboot.demo.my.app.commom;

import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor{
    @Override
    public String getProgrammingExercise() {
        return "Calculate area of triangle";
    }
}
