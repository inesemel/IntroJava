package com.company.oop.homework10;

import com.company.oop.Person;

public class Employee extends Person {

    private String companyID;
    private String companyName;

    public Employee(String name, int age, String companyID, String companyName) {
        super(name, age);
        this.companyID = companyID;
        this.companyName = companyName;
    }
}
