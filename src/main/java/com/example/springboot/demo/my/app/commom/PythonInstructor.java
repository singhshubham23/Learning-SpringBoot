package com.example.springboot.demo.my.app.commom;

import org.springframework.stereotype.Component;


@Component
public class PythonInstructor implements Instructor{
    public PythonInstructor(){
        System.out.println("Instructor implements " +getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Calculate area of triangle";
    }
}
