package com.example.demo;

import com.example.demo.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;
public interface EmployeeService {
    float totalSalary(List<Job> list);
    int totalBonus(List<Job> list);
}
