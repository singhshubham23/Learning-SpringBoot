package com.example.springboot.demo.my.app.commom;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaInstructor  implements Instructor {
    public JavaInstructor(){
        System.out.println("Instructor implements " +getClass().getSimpleName());
    }

    @PostConstruct
    public void initiateCode(){
        System.out.println("Initiate Code " +getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanCode(){
        System.out.println("Clean Code " +getClass().getSimpleName());
    }

    @Override
    public  String getProgrammingExercise(){
        return "Write a method to sum two numbers";
    }
}
