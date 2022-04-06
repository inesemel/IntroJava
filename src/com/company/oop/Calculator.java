package com.company.oop;

public class Calculator {

    // instance variable is a variables whose values are attached to a particular
    // instance of an object

    //instance method is a method is attached  to a particular instance of am object

    public static int add(int smallNumber, int bigNumber) {
        return smallNumber + bigNumber;
    }

    public static int subtract(int smallNumber, int bigNumber) {
        return bigNumber - smallNumber;
    }

    public static int multiplay(int smallNumber, int bigNumber) {
        return smallNumber * bigNumber;
    }
    public float divide(float smallNumber, float bigNumber) {
        return bigNumber / smallNumber;
    }
}
