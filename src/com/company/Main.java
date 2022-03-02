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


        //Non-numeric primitives
        // char- characters
        //boolean- true or false values


//        Arithmetic Operators:
        //+ - addition
        System.out.println("Addition of number and value is: " + (number + value));

        // - - substraction
//        System.out.println("Addition of number and value is: " + (number - value));
//         / = division
//        System.out.println("Addition of number and value is: " + (number / value));
//         * - multiplication
//        System.out.println("Addition of number and value is: " + (number * value));
//         % - modulus
//        System.out.println("Addition of number and value is: " + (number % value));
        //A comment is a piece of text in your code that isn't executed by the computer.

        //Our first Java program

        System.out.println("Hello World!");



        //Task 10 min

//        String gender= "F";
//
//        int age= 22;
//
//        float height= 1.65;
//
//        float weight = 65;


        //Type conversion

        //Java allows you tp IMPLICITLY convert from a smaller data type to a bigger one,
        //but not in the other way round.
        //For you to convert from bigger to smaller you must do it EXPLICITLY. This is
        //called CASTING.
        //smaller --> bigger
        int five=5;
        long newValue = five;

        //bigger --> smaller
        long   six=6;
        int intValue = (int)six;

        double deciNumber = 6.47395638294;
        System.out.println("Double value: " + deciNumber);
        int truncatedValue = (int)deciNumber;
        System.out.println("Integer version: " + truncatedValue);


        boolean bool = true;
        boolean loob = 8>5;

        //boolean is simply a statement or expression that result in true or false

        //relation operators
        //>  greater than
        //<  less then
        // == equals to
        // >= greater than or equals to
        // <= less than equals to


       // System.out.println(5==8); //false
        //System.out.println(9<= 19); //true


        //Logical operators:
        //&& - and operator

       // System.out.println(5<8 && 8<3);


        // ||- OR operator
       // System.out.println(5<8 || 8<3);

        System.out.println(6<9 && 9>2); //true

        System.out.println(5>8 || 8<3); // false

        System.out.println(8==2 && 7<6); // false



        // Java Conventions regarding naming
        //you can't use keywords as name, e.g., you can't use
        //'int' as a variable name
        // variables & methods- incrementOne, birdSound, numberOfWings
        // class - IncrementOne, bIrdSound, NumberOfWings

    }
}



