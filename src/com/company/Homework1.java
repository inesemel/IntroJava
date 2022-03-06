package com.company;

public class Homework1 {
    public static void main(String[] args) {

        //Task 1: prime numbers

        for (int n = 1; n < 81; n++){ //run from 1 to 80, assuming you don't know that one is not a prime numbers
            int x = 0; //initialize counter to count the number of numbers that divide i
            for (int j = n; j >= 1; j--){ // nested loop - a loop inside of a loop
                if (n % j == 0){
                    x = x+1;
                }
            } if (x==2){
                System.out.println(n + " is a prime number");
            }
        }


        for (int i = 2; i < 81; i++){ //run from 1 to 80, assuming you don't know that one is not a prime numbers
            int x = 0; //initialize counter to count the number of numbers that divide i
            for (int k = 2; k <= i/2; k++){ // nested loop - a loop inside of a loop
                if (i % k == 0){
                    x = x+1;
                }
            } if (x==0){
                System.out.println(i + " is a prime number");
            }
        }


        //Task 2: a calculator
        char operator = '^'; // you can change an operator
        double a = 25; // you can change numbers
        double b= 5;
        double c;
        if (operator == '+'){
            c = a + b;
            System.out.println(c);
        } else if (operator == '-'){
            c = a - b;
            System.out.println(c);
        } else if (operator == '/'){
            c = a / b;
            System.out.println(c);
        } else if (operator == '*') {
            c = a * b;
            System.out.println(c);
        } else {
            System.out.println("There is no suitable mathematical operation");
        }

    }
}
