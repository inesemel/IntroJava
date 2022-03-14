package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Class14march {
    public static void main(String[] args) {

        //Homework task1
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a string: ");
//        String inputString = scanner.nextLine();
//        String responseString = "";
//        String errorString = "";
//
//        int counter = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLet = inputString.toLowerCase().charAt(i);
//            switch (currentLet) {
//                case 'u':
//                case 'w':
//                case '6':
//                case 'i':
//                case 'b':
//                case 'q':
//                    counter++;
//                    responseString = "The string contains " + counter+ " specific characters";
//                    break;
//                default:
//                    errorString = "The string doesn't contain specific characters";
//                    break;
//            }
//
//        }
//        if (responseString.isEmpty()){
//            System.out.println(errorString);
//        }else{
//            System.out.println(responseString);
//        }

        //task2:
//        System.out.print("Please enter a string: ");
//        String stringOne = scanner.nextLine();
//        String stringTwo="";
//
//        for (int j=(stringOne.length()-1); j>=0; j--){
//            stringTwo += stringOne.charAt(j);
//        }
//        if (stringTwo.equalsIgnoreCase(stringOne)){
//            System.out.println(stringOne + " is the same when spelt backwards");
//        }else{
//            System.out.println(stringOne + " is not the same when spelt backwards");
//        }

        //ARRAYS
        // An array is a collection of multiple data units of a single data types.
        //

        // First we declare an array (you have predetermined values)
//        int[] numbers = {4, 5, 0, 4};
//        System.out.println(numbers.length);
        // numbers.length; don't use parentheses

        //Second way to declare an array, (You have unknown values to be added later)

//        int[] number = new int [4]; // default value for int is 0
//        String[] textArr = new String[6]; // default value for objects including String is null
//
//        textArr[3] = "orange";
//
//        for (int i = 0; i < number.length; i++) {
//            System.out.print("Enter a number: ");
//            number[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(number));
//
//        int sum = 0;
//        for (int i= 0; i<number.length; i++){
//            sum+= number[i];
//        }
//        System.out.println("The sum is: " + sum);

        //Task1:
        // write a program to find the average of a set of numbers that the user enters.
        //allows the user to decide the number of integer to enter.
        //interactively return the output to the console.

        System.out.print("Please enter number of integers you want to use: ");
        int intNumber = scanner.nextInt();
        int[] userArr = new int [intNumber];
        for (int i = 0; i < userArr.length; i++) {
            System.out.print("Enter a number: ");
            userArr[i] = scanner.nextInt();
        }

        double average;
        int sum = 0;
        for (int i= 0; i<userArr.length; i++){
            sum+= userArr[i];
        }
        average = sum/intNumber;
        System.out.println("The average is: " + average);
    }
}
