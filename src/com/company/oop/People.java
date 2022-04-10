package com.company.oop;

public class People {
    // Define properties of th class

    private Person[] people;

    public People(Person[] people){
        this.people = people;
    }
    public float getAverageAge(){
        float sum = 0; // initialize the sum variable to zero
        // for-each loop

        for(Person person : people){
            // person == person[i]
            sum+= person.getAge();
        }

        return sum / people.length;
    }
}
