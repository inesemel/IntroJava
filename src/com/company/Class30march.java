package com.company;
import java.util.Scanner;
public class Class30march {
    // Write a method that compares two strings (that could be passwords) and return true or false
    //based on their equality

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task1:
//        System.out.print("Enter the first one password: ");
//        String passwordOne = scanner.next();
//        System.out.print("Enter the second one password: ");
//        String passwordTwo = scanner.next();
//
//        System.out.println(passwordOne + " and " + passwordTwo + " : " + equalityCheck(passwordOne, passwordTwo));

        //Task2:
//        System.out.print("Enter the principal: ");
//        double principal = scanner.nextDouble();
//        System.out.print("Enter the rate of interest in per cents: ");
//        double rate = scanner.nextDouble();
//        System.out.print("Enter time in years: ");
//        double time = scanner.nextDouble();
//
//        System.out.println("The amount of interest is: " + simpleInterest(principal, rate, time));

        //Task 3
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        System.out.println(number + (isPrime(number)? " is a prime number" : " is not a prime number"));
        String a = "Hello";
        System.out.println(a.substring(1));

    }




//    public static String equalityCheck(String passOne, String passTwo){
//        if(passOne.equals(passTwo)){
//            return "Passwords are equal";
//        } else{
//            return "Passwords are not equal";
//        }
//    }
    // Write a method to calculate simple interest and return it
    //Google the simple interest formula
//    public static double simpleInterest(double principal, double rate, double time){
//        return principal * rate * time / 100;
//    }

    //Write a method that accepts an integer and returns whether that integer is a prime number or not.

    public static boolean isPrime(int number){
        int x = 0;
        for (int k = 2; k <= number/2; k++){ // nested loop - a loop inside of a loop
            if (number % k == 0){
                x = x+1;
            }
        } if (x==0){
            return  true;
        } else{
            return false;
        }
    }


    //Recursion
    //Recursion is a phenomenon where the method calls itself
    // a base case is the condition under which you want a recursion operation to end.

    // Factorial of the number is the multiplication of the number by all the positive
    // integers between 1 and the number
    // The only exception being is 0! = 1

//    public  static int factorial(int number){
//        int result = 1;
//        for (int i = 0; i <= number; i++) {
//            result *= i; // multiply all the numbers between 1 and the number
//
//        }
//        return result;
//    }
//
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Write a method that returns the length of a string
    public static int lengthOfString(String value){
        if (value.equals("")){
            return 0;
        }
        return lengthOfString(value.substring(1)) + 1;
    }

    //Home tasks
    //Using recursion, write a method that takes a number as a parameter and
    //returns the total sum between one and the number;
    //upToNumber(8) -> 1 + 2 + 3 .. + 8

    //Using recursion, write a method that takes a string as a parameter
    // and returns the reverse of the string

}
