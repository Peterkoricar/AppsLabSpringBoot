package com.example.demo.model;

public class Job {
    protected float salary;
    protected int bonus;
    protected JobType jobname;

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public Job(float salary, int bonus, JobType jobname) {
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
