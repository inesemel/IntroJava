package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Class16march {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1:
        //Ask a user to enter a range of numbers and sort that
        // group of numbers in such a way that even numbers come first in the output and
        //odd numbers after the even numbers.
        //The sorted version is [2, 4, 8, 10, 5, 9, 7, 3]

        // Solution 1

//        System.out.print("Please enter the number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] userArr = new int[intNumber];
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//        }
//        int[] sortedArr = new int[userArr.length];
//        int countEven = 0;
//        for (int i = 0; i < userArr.length; i++) {
//            if (userArr[i] % 2 == 0){
//                countEven++;
//                sortedArr[countEven - 1] = userArr[i];
//
//            }
//        }
//
//        int countOdd = 0;
//        for (int i = 0; i < userArr.length; i++) {
//            if (userArr[i] % 2 != 0){
//                countOdd++;
//                sortedArr[countEven - 1 + countOdd] = userArr[i];
//            }
//        }
        //  System.out.println("Sorted array is: " + Arrays.toString(sortedArr));

        //Solution 2
        //separate the even numbers and odd numbers in one for loop
        //create counter to count the odd and the even numbers entered
//        System.out.print("Please enter the number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] userArr = new int[intNumber];
//        int countOdd = 0;
//        int countEven = 0;
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//            if (userArr[i] % 2 == 0) countEven++;
//            else countOdd++;
//        }
//        int[] sortedArr = new int[userArr.length];
//
//        int counterEven = 0;
//        int counterOdd = 0;
//        for (int i = 0; i < userArr.length; i++) {
//            if (userArr[i] % 2 == 0){
//                counterEven++;
//                sortedArr[counterEven - 1] = userArr[i];
//
//            }else {
//                counterOdd++;
//                sortedArr[countEven - 1 + counterOdd] = userArr[i];
//            }
//        }
//
//        System.out.println("Sorted array is: " + Arrays.toString(sortedArr));

//

//
//


        // Task2:
        //Write a program to return the second largest number from a stream of inputted integers
        //from a user.

//        System.out.print("Please enter number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] userArr = new int[intNumber];
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(userArr);
//        int secondLargest = userArr[userArr.length - 2];
//        System.out.println(secondLargest);



        //Task 3:
        //Write a program to find out if in the list of numbers entered by a user
        //there are no multiples of 3.

//        System.out.print("Please enter the number of integers you want to use: ");
//        int[] userNumbers = new int[scanner.nextInt()];
//        boolean multiples = false;
//        int multiplesCount = 0;
//
//        for (int i = 0; i < userNumbers.length; i++) {
//            System.out.print("Enter a number: ");
//            userNumbers[i] = scanner.nextInt();
//            if (userNumbers[i] % 3 == 0) {
//                multiples = true;
//                multiplesCount++;
//
//            }
//        }
//
//        if (multiples == true) {
//            System.out.println("There is/are " + multiplesCount + " multiples of 3 ");
//        } else{
//            System.out.println("There isn't any multiples of 3");
//        }


    }
}
