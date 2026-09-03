package com.example.springboot.demo.my.app.commom;

// Add 'implements Instructor' (or whatever your interface name is)
public class CInstructor implements Instructor {

    public CInstructor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getProgrammingExercise() {
        return "Practice C Pointers and Memory Allocation!";
    }
}