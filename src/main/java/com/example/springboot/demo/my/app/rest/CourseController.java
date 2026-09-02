package com.example.springboot.demo.my.app.rest;

import com.example.springboot.demo.my.app.commom.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private Instructor myInstructor;
    private Instructor anotherInstructor;


    @Autowired
    public CourseController(@Qualifier("javaInstructor") Instructor instructor,
                            @Qualifier("javaInstructor") Instructor theAnotherInstructor){
        myInstructor = instructor;
        anotherInstructor = theAnotherInstructor;
    }

    @GetMapping("/programmingexercise")
    public String getProgrammingExercise(){
        return myInstructor.getProgrammingExercise();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: "+(myInstructor == anotherInstructor);
    }
}
