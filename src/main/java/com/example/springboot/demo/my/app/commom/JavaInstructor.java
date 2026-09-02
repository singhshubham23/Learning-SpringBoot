package com.example.springboot.demo.my.app.commom;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaInstructor  implements Instructor {
    public JavaInstructor(){
        System.out.println("Instructor implements " +getClass().getSimpleName());
    }

    @Override
    public  String getProgrammingExercise(){
        return "Write a method to sum two numbers";
    }
}
