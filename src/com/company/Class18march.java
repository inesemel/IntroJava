package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Class18march {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //homework task1

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
        //Task1
        //Write a program to rearrange the following array of unique elements such that each second
        // integer is greater than
        // the integers to it's left and right.
        // {3, 5, 9, 10, 7, 2, 1}
        // {1, 3, 2, 7, 5, 10, 9}

//        int[] numbers = {3, 5, 9, 10, 7, 2, 1};
////        Arrays.sort(numbers); // is not mandatory
////        int numberX;
//
//        //Loop through the numbers array starting from the second element
//        for (int i = 1; i < numbers.length; i += 2) {
//
//            if (numbers[i] < numbers[i - 1]){
//
//                int numberX = numbers[i];
//                numbers[i] = numbers[i - 1];
//                numbers[i - 1] = numberX;
//            }
//
//            if (numbers[i] < numbers[i + 1] && (i + 1) < numbers.length){
//
//                int numberX = numbers[i + 1];
//                numbers[i + 1] = numbers[i];
//                numbers[i] = numberX;
//            }
//        }
//
//        System.out.println("The rearranged array is " + Arrays.toString(numbers));

        // 2 ^ 3 = 8
        System.out.println(Math.pow(2, 3));

        System.out.println(Math.max(5, 9));

        //Task2:
        // write a program that allows to enter the base and the height of a triangle and returns
        // the area of the triangle interactively to the user.

        System.out.print("Please enter a base of a triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Please enter a height of a triangle: ");
        double height = scanner.nextDouble();


        double area = 0.5 * base * height;
        System.out.println("The area is " + area);

        //Task3:
        // write a program that accepts a, b, c and allows a calculates a quadratic equation on a user input.

        System.out.print("Please enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Please enter the coefficient c: ");
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - (4 * a * c);
        if (d < 0){
            System.out.println("Equation does not have real solution");
        }else{
            double x1 = (-b + Math.sqrt(d))/(2 * a);
            double x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("The first root is: " + x1 + " and the second root is: " + x2);
       }
    }
}
