package com.example.demo;

import com.example.demo.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;

    @Override
    public float totalSalary(List<Job> list) {
        return (float) list.stream().mapToDouble(Job::getSalary).sum();
    }

    @Override
    public int totalBonus(List<Job> list) {
        return list.stream().mapToInt(Job::getBonus).sum();
    }
    public void writeNumber(){
        System.out.println(++number);
    }
}


