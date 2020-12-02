package com.example.demo;

import com.example.demo.model.Driver;
import com.example.demo.model.Job;
import com.example.demo.model.Programmer;
import com.example.demo.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class DependencyInjectionDemo2 {
    EmployeeService hastag1;

    public DependencyInjectionDemo2(EmployeeService hastag1) {
        this.hastag1 = hastag1;
        ((EmployeeServiceImpl)hastag1).writeNumber();
    }
}
