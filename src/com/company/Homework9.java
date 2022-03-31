package com.company;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        //Task 1:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("The sum of number between 1 and " + userNumber + " is " + sum(userNumber));

        //Task2:
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();
        System.out.println("The reverse of the string " + userString + " is: " + reverse(userString));
    }

    //Task1:
    //Using recursion, write a method that takes a number as a parameter and
    //returns the total sum between one and the number;
    //upToNumber(8) -> 1 + 2 + 3 .. + 8
    public static int sum(int number){
        if (number == 1){
            return 1;
        } else{
            return number + sum(number - 1);
        }
    }

    //Using recursion, write a method that takes a string as a parameter
    // and returns the reverse of the string

    public static String reverse(String string){
        if (string.equals("")){
            return string;
        } else{
            return reverse(string.substring(1)) + string.charAt(0);
        }
    }
}
