package com.example.demo.employee;

import com.example.demo.model.Employee;

import java.util.List;
public interface EmployeeService {
    float totalSalary(List<Employee> list);
    int totalBonus(List<Employee> list);
    void saveEmployee(Employee employee);
}
