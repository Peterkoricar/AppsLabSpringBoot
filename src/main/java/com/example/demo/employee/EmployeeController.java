package com.example.demo.employee;

import com.example.demo.SGUTS;
import com.example.demo.company.Company;
import com.example.demo.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class EmployeeController {
    List<Employee> joblist = new ArrayList<Employee>();
    EmployeeService employeeService;
    Company company;
     public EmployeeController(EmployeeService hastag2) {
         Collections.addAll(joblist,new Driver(750,300),new Programmer(1200, 250), new Teacher(600, 200));
         this.employeeService = hastag2;
     }
    @GetMapping("/")
    String homeless() {
        return "Hello, World!";
    }
    @GetMapping("/bonuses")
    float bonuses(){
        return ( employeeService.totalBonus(joblist));
    }
    @GetMapping("/sallary")
    float salarry(){
        return ( employeeService.totalSalary(joblist));
    }
    @GetMapping("/total")
    float totalD(@RequestParam float a,@RequestParam float b,@RequestParam float c ){
         return (float) SGUTS.snail(a,b,c);
    }
    @PostMapping("/employeelist")
    public void employeeeList(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }
}
