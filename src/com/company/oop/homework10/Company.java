package com.company.oop.homework10;
import java.util.Random;

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

    private Random rand = new Random();
    public Employee randomWorker(){
        return employees[rand.nextInt(employees.length)];
    }


    public String getRandom(){
        int randomIndex = (int)(Math.random() * 10);
        if (randomIndex >= employees.length) return getRandom();
        return employees[randomIndex].getName();
    }

}
