package com.backend.springback.rest;

import util.CoachImpl;
import util.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {

    @Autowired
    CoachImpl coach;

    @Autowired
    Students students;

    @Autowired
    MyBean myBean;

    // Define customer properties
    @Value("${admin.fname}")
    private String adminFname;

    @Value("${admin.lname}")
    private String adminLname;

    // method to call customer properties

    @GetMapping("/admin")
    public String adminFullName(){
        return "my name is " + adminFname + ", " + adminLname;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name",defaultValue = "nothing") String name){
        return "Hello " + name;
    }

    @GetMapping("/student")
    public String studentInfo(){
        return "student results";
    }

    @GetMapping("/callFuncs")
    public String allFuncs(){
        String stdInfo = studentInfo();
        String sayHello = sayHello("Samweli");
        String getDailyWorkout = getDailyWorkout();
        String viewStudents = viewStudents();

        return getDailyWorkout + "<br>" + viewStudents;
        //return stdInfo + "<br>" + sayHello + "<br>" + myBean.phoneNumber("0763194940");
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/viewStudents")
    public String viewStudents(){
        return students.viewStudents();
    }
}
