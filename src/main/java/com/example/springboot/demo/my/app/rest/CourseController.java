package com.example.springboot.demo.my.app.rest;

import com.example.springboot.demo.my.app.commom.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private Instructor myInstructor;

//    @Autowired
//    public void setInstructor(Instructor instructor){
//        myInstructor = instructor;
//    }

    @Autowired
    public CourseController(@Qualifier("pythonInstructor") Instructor instructor){
        myInstructor = instructor;
    }

    @GetMapping("/programmingexercise")
    public String getProgrammingExercise(){
        return myInstructor.getProgrammingExercise();
    }
}
