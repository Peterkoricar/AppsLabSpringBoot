package com.example.demo.employee;

import com.example.demo.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

@Component
public class DependencyInjectionDemo {
    EmployeeService hastag1;

    public DependencyInjectionDemo(EmployeeService hastag1) {
        this.hastag1 = hastag1;
        List<Employee> list = new ArrayList<Employee>();
        Collections.addAll(list, new Driver(750,300),new Programmer(1200, 250), new Teacher(600, 200));
        System.out.println(getSum(list));
        ((EmployeeServiceImpl)hastag1).writeNumber();
    }

    float getSum(List<Employee> employeeList){
        return hastag1.totalSalary(employeeList) + hastag1.totalBonus(employeeList);
    }

}
