package com.example.springboot.demo.my.app.commom;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class PhpInstructor implements Instructor{
    public PhpInstructor(){
        System.out.println("Instructor implements " +getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Write a program convert degree";
    }
}
