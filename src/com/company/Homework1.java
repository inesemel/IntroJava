package com.company;

public class Homework1 {
    public static void main(String[] args) {

        //Task 1: prime numbers

        for (int n = 2; n < 81; n++){
            int x = 0;
            for (int j = n; j >= 1; j--){
                if (n % j == 0){
                    x = x+1;
                }
            } if (x==2){
                System.out.println(n + " is a prime number");
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
