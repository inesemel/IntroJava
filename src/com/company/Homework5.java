package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Task1: You're given a string of words from the user. You need to find the word "Nemo",
        // and return a string like this: "I found Nemo at [the order of the word you find Nemo]!".
        // If you can't find Nemo, return "I can't find Nemo :(".

//        System.out.print("How many words are you going to enter? ");
//        int len = scanner.nextInt();
//        String[] userWords = new String[len];
////
//        for (int i = 0; i < len; i++) {
//            System.out.println("Please enter a word: ");
//            userWords[i] = scanner.next();
//        }
////
//
//
//        String order = "";
//        Boolean isNemo = false;
//        String nemo = "Nemo";
//        for (int j = 0; j < len; j++) {
//            if (userWords[j].equals(nemo)){
//                isNemo = true;
//                order = order + Integer.toString(j) + " ";
//            }
//        }
//
//        if (isNemo == true){
//            System.out.println("I found Nemo at " + order);
//        } else{
//            System.out.println("I can't find Nemo :(" );
//        }


        //Another solution
//        System.out.print("Please enter a string ");
//        String userInput = scanner.nextLine();
//
//        // break the string up into words
//        String[] wordArray = userInput.split(" ");
//
//        //loop through and find the position of the word 'Nemo'
//
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].equalsIgnoreCase("Nemo")){
//                System.out.println("I found Nemo at word number " + (i + 1) + "!");
//                break;
//            }
//            if (i == wordArray.length - 1 && !wordArray[i].equalsIgnoreCase("Nemo")){
//                System.out.println("I can't find Nemo :(");
//            }
//        }
        //Task2:Create a program that takes an array and returns the difference between
        // the biggest and smallest numbers.

//        System.out.print("Please enter number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] userArr = new int[intNumber];
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(userArr);
//        int difference = userArr[userArr.length - 1] - userArr[0];
//        System.out.println(difference);

        //Another solution

//        System.out.print("Please enter number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] numbers = new int[intNumber];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        //this is to ensure that our minimum and maximum correlates with
//        //our existing dataset
//
//        int minimum = numbers[0];
//        int maximum = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (maximum < numbers[i]) maximum = numbers[i];
//
//            if (minimum > numbers[i]) minimum = numbers[i];
//        }
//
//        System.out.println(Arrays.toString(numbers) + "difference between min and max numbers: " +
//                (maximum = minimum));

        //Task3:Create a program that takes an array of Strings
        // (You can initialize the variable without user input) and checks if the last
        // item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true

//        int arrayLength = 4;
//        String[] words = new String[arrayLength];
//        words[0] = "sister";
//        words[1] = "loves";
//        words[2] = "cats";
//        words[3] = "mysisterlovescats";
//
//        String concatenatedWord = "";
//        for (int i = 0; i < arrayLength - 1; i++) {
//            concatenatedWord = concatenatedWord + words[i];
//        }
//
//        if (concatenatedWord.equals(words[arrayLength - 1])){
//            System.out.println("The last item matches the rest of the array concatenated together");
//        } else {
//            System.out.println("The last item doesn't matches the rest of the array concatenated together");
//        }
        // Another solution
        String[] stringArr = {"i", "love", "tesh", "ilovetesh"};
        String appender = "";
        for (int i = 0; i < stringArr.length - 1; i++) {
            appender += stringArr[i];
        }
        //Ternary operator
        // Ternary operator is a conditional that can be used to decide execution
        //flow on the fly
        System.out.println(appender.equals(stringArr[stringArr.length - 1]) ? "match" : "don't ,atch");




    }
}
