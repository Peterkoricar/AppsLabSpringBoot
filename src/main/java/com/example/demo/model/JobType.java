package com.example.demo.model;

public enum JobType {
    TEACHER("Teacher"), PROGRAMMER("Programmer"), DRIVER("Driver");
    private String name;

    public String getName() {
        return name;
    }

    JobType(String name){
        this.name = name;
    }
}

