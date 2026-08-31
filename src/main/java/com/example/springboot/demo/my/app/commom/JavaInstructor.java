package com.example.springboot.demo.my.app.commom;


import org.springframework.stereotype.Component;
@Component
public class JavaInstructor  implements Instructor {

    @Override
    public  String getProgrammingExercise(){
        return "Write a method to sum two numbers";
    }
}
