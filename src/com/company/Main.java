package com.company;

public class Main {

    public static void main(String[] args) {
	// What is Java?
        // Java is an object-oriented programming language
        // that allows us to model real life functionality as objects in our code.

        //Features of Java
        //Java is a strictly-typed language.
        //Java is also a compiled language, it is turned into 'bytecode'.
        //Java is a high language.
        //Java is run on the JVM(Java Virtual Machine).
        //The JVM creates platform-independence for Java.

        //What is computer programming?
        //Computer Programming is a process of giving a computer or IT device a series of instructions
        //that tells it the order and process in which to carry out
        // or execute a specific task or set of tasks.

        //Concepts of programming in Java
        //variables and data types
        //conditionals
        //loops
        //methods
        //classes


        //Variables and data types
        //  Primitive values
        //int (integer)
        //short
        //byte
        //char
        //long  has a max 7 decimal places
        //float
        //double
        //  Complex object
        //strings


        //Variable: Think of a variable like an empty box,
        // where as soon as you create a box you decide what type of items
        // you can put in the box, and you cannot put a different type of item later on.

        //P. S. You cannot have a variable with the same name in the same scope in Java

        //A variable declaration is simply giving your variable a name and a data type.
        //A variable initialization is the point where you finally give that variable a value to start with.


        float number; //variable declaration

        number=4;  //variable initialization

        float value = 6; //variable declaration and initialization in the same line
//        byte byteValue = 1;

//        char charValue = '9';
//        String text = "I am going to school";

//        long digits = 5L;

//        float decimalFloats = 3.683f;

//        double decimalDouble = 5.3748210474929


//        Arithmetic Operators:
        //+ - addition
        System.out.println("Addition of number and value is: " + (number + value));

        // - - substraction
        System.out.println("Addition of number and value is: " + (number - value));
        // / = division
        System.out.println("Addition of number and value is: " + (number / value));
        // * - multiplication
        System.out.println("Addition of number and value is: " + (number * value));
        // % - modulus
        System.out.println("Addition of number and value is: " + (number % value));
        //A comment is a piece of text in your code that isn't executed by the computer.

        //Our first Java program

        System.out.println("Hello World!");


    }
}
