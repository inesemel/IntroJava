package com.company.oop;

public class Person {
    // define the properties or attributes of a person

    private String name;
    private int age;
    private double height;
    private double weight;
    private double bmi;

    //Constructor - a constructor is a utility that allows us to
    // create instances of objects

    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

//    public Person(String name, int age, double height, double weight){
//
//        this.name = name;
//        this.age = age;
////        this.height = height;
////        this.weight = weight;
//    }

    public double bmi(){
         double weight = getWeight();
         double height = getHeight();
         return bmi = (weight / Math.pow(height, 2));

    }

    //Getters - allow us read data from the class
    // setters - allow us write data to the class

    //Method/Constructor overloading - this is a way to define multiple constructors or methods
    // with the same name, but they must have different method/constructor signatures.

    //Method/Constructor signatures - this is the number and data type of the parameters and
    // the order in which those parameters defined.


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }



}
