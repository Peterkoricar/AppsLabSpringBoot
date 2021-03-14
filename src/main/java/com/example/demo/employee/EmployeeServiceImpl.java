package com.example.demo.employee;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    int number = 0;

    @Override
    public float totalSalary(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int totalBonus(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void writeNumber(){
        System.out.println(++number);
    }
}


