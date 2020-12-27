package com.example.demo.model;

public class Programmer extends Job {

    public Programmer (float salary, int bonus){
        super(salary, bonus, JobType.PROGRAMMER);
    }
    @Override
    public String getInfo() {
        return ("The programmer has a sallary of " + (salary + bonus));

    }
}
