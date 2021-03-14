package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    protected float salary;
    protected int bonus;
    @Enumerated(EnumType.ORDINAL)
    private JobType jobname;

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public Employee(float salary, int bonus, JobType jobname) {
        this.salary = salary;
        this.bonus = bonus;
        this.jobname = jobname;
    }
    public String getInfo(){
        if(jobname == JobType.PROGRAMMER) {
            return (jobname + " has a salary: " + (salary + bonus));
        }
        return (jobname + " has a salary: " + salary + " and a bonus: " + bonus);
    }
}
