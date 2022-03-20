package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task1:
        //Write a Java program to find maximum product of two integers in a given array of integers
        // Example: Input nums={2, 3, 5, 7, -7, 5, 8, -5} Output Pair is (7, 8, Maximum Product: 56)

//        System.out.print("Please enter the number of integers you want to use: ");
//        int[] userNumbers = new int[scanner.nextInt()];
//        for (int i = 0; i < userNumbers.length; i++) {
//            System.out.print("Enter a number: ");
//            userNumbers[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(userNumbers);
//        if(userNumbers.length == 1) {
//            System.out.println("There is only one number in the array. Cannot find product!");
//        }else if (userNumbers.length == 2){
//            int prod = userNumbers[0] * userNumbers[1];
//            System.out.println("The pair is (" + userNumbers[0] + ", " + userNumbers[1] + ") Maximum Product: " + prod);
//        }else{
//            int lowProd = userNumbers[0] * userNumbers[1];
//            int upProd = userNumbers[userNumbers.length - 1] * userNumbers[userNumbers.length - 2];
//            if (lowProd > upProd) {
//                System.out.println("The pair is (" + userNumbers[0] + ", " + userNumbers[1] +
//                        ") Maximum Product: " + lowProd);
//            } else if (lowProd < upProd){
//                System.out.println("The pair is (" + userNumbers[userNumbers.length - 2] + ", " +
//                        userNumbers[userNumbers.length - 1] + ") Maximum Product: " + upProd);
//            }else{
//                System.out.println("The pairs are (" + userNumbers[0] + ", " + userNumbers[1] +") and (" +
//                        userNumbers[userNumbers.length - 2] + ", " +
//                        userNumbers[userNumbers.length - 1] + ") Maximum Product: " + upProd);
//            }
//        }

        //Task2:
        //Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
        //Input :
        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
        //Output:
        //Sub-array size: 4
        //Sub-array from 0 to 3 and sum is: 10

        System.out.print("Please enter the number of integers you want to use: ");
        int[] userNumbers = new int[scanner.nextInt()];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.print("Please enter size of the sub-array: ");
        int[] subarray = new int[scanner.nextInt()];
        if(subarray.length > userNumbers.length) {
            System.out.println("Sub-array size is bigger than array size!");
        }else{
            Arrays.sort(userNumbers);

            int sum = 0;
            for (int i = 0; i < subarray.length; i++) {
                subarray[i] = userNumbers[i];
                sum = sum + subarray[i];
            }

            System.out.println("Sub-array size: " + subarray.length);
            System.out.println("Sub-array from 0 to " + (subarray.length - 1) +
                    " and sum is " + sum);
        }
    }
}
