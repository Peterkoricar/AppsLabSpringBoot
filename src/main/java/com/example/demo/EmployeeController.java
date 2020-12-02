package com.example.demo;

import com.example.demo.model.Driver;
import com.example.demo.model.Job;
import com.example.demo.model.Programmer;
import com.example.demo.model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class EmployeeController {
    ArrayList<Job> joblist = new ArrayList<Job>();
    EmployeeService hastag2;
     public EmployeeController(EmployeeService hastag2) {
         Collections.addAll(joblist,new Driver(750,300),new Programmer(1200, 250), new Teacher(600, 200));
         this.hastag2 = hastag2;
     }
    @GetMapping("/")
    String homeless() {
        return "Hello, World!";
    }
    @GetMapping("/bonuses")
    float bonuses(){
        return ( hastag2.totalBonus(joblist));
    }
    @GetMapping("/sallary")
    float salarry(){
        return ( hastag2.totalSalary(joblist));
    }
    @GetMapping("/total")
    float totalD(@RequestParam float a,@RequestParam float b,@RequestParam float c ){
         return (float) SGUTS.snail(a,b,c);
    }
}
