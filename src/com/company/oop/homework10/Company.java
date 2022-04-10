package com.company.oop.homework10;

import com.company.oop.Person;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees){
        this.employees = employees;
    }

    public float getAverageAge(){
        float sum = 0; // initialize the sum variable to zero
        // for-each loop

        for(Employee employee : employees){
            // person == person[i]
            sum+= employee.getAge();
        }

        return sum / employees.length;
    }
}
