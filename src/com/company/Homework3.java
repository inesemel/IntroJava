package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // Task1: Write a program that returns true interactively, if a user enters a string containing
        // any of these characters: 'u', 'w', '6', 'i', 'b', 'q'

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentLet = inputString.toLowerCase().charAt(i);
            switch (currentLet) {
                case 'u':
                case 'w':
                case '6':
                case 'i':
                case 'b':
                case 'q':
                    counter++;
                    break;
                default:
                    break;
            }

        }
        if (counter>0){
            System.out.println("The string contains " + counter+ " specific characters");
        }else{
            System.out.println("The string doesn't contain specific characters");
        }

        //Task2: Write a program that accepts a String from a user
        // and prints an interactive response telling the user if the word is the same when spelt backwards.
        // For example, bread when spelt backwards is daerb, which isn't quite the same.

        System.out.print("Please enter a string: ");
        String stringOne = scanner.nextLine();
        String stringTwo="";

        for (int j=(stringOne.length()-1); j>=0; j--){
            stringTwo = stringTwo + stringOne.charAt(j);
//            string5 += string4.charAt(j);
        }
        stringOne = stringOne.toLowerCase();
        stringTwo = stringTwo.toLowerCase();
        Boolean boolOne = true;
        int lengthOne = stringOne.length();
        for (int i = 0; i < lengthOne; i++) {
            if (stringOne.charAt(i)!=stringTwo.charAt(i)){
                boolOne = false;
                break;
            }
        }
        if (boolOne == false){
            System.out.println(stringOne + " is not the same when spelt backwards");
        }else{
            System.out.println(stringOne + " is the same when spelt backwards");
        }

        //Task3: Write a program that accepts any of the primary colors as a String
        // and returns the complimentary color of that color to the user.
        System.out.print("Please enter a color red, yellow or blue : ");
        String colorString = scanner.nextLine();

        colorString = colorString.toLowerCase();
        switch (colorString){
            case "red":
                System.out.println("The complimentary color of red is green");
                break;
            case "yellow":
                System.out.println("The complimentary color of yellow is purple");
                break;
            case "blue":
                System.out.println("The complimentary color of blue is orange");
                break;
            default:
                System.out.println("The complimentary color could not be found");
                break;


        }
    }
}
