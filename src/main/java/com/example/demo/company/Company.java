package com.example.demo.company;

import com.example.demo.Adress;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress", referencedColumnName = "id")
    private Adress adress;
    public Company(){

    }
    public Company(int id, String name, Adress adress){
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

}
