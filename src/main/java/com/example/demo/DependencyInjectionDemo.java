package com.example.demo;

import com.example.demo.model.Driver;
import com.example.demo.model.Job;
import com.example.demo.model.Programmer;
import com.example.demo.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

@Component
public class DependencyInjectionDemo {
    EmployeeService hastag1;

    public DependencyInjectionDemo(EmployeeService hastag1) {
        this.hastag1 = hastag1;
        List<Job> list = new ArrayList<Job>();
        Collections.addAll(list, new Driver(750,300),new Programmer(1200, 250), new Teacher(600, 200));
        System.out.println(getSum(list));
        ((EmployeeServiceImpl)hastag1).writeNumber();
    }

    float getSum(List<Job> jobList){
        return hastag1.totalSalary(jobList) + hastag1.totalBonus(jobList);
    }


}
