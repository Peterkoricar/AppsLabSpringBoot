package com.example.demo.employee;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionDemo2 {

    public DependencyInjectionDemo2(EmployeeService hastag1) {
        ((EmployeeServiceImpl)hastag1).writeNumber();
    }
}
