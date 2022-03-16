package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Task1: Write a program that receives some numbers based on the user’s choice
        // and then returns the largest number of the ones the user entered.

//        System.out.print("Please enter number of integers you want to use: ");
//        int intNumber = scanner.nextInt();
//        int[] userArr = new int[intNumber];
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(userArr);
//        int largest = userArr[userArr.length - 1];
//        System.out.println(largest);


//        int maximum = userArr[0];
//
//        for (int i = 1; i < userArr.lenght; i++) {
//            if (maximum < userArr[i]){
//                maximum = userArr[i]
//            }
//        }
//        System.out.println(maximum);

        //Task2:Write a program that accepts a String from the user and
        // returns an array of integers representing the counts of each vowel in the String.
        // The array returned by your method should hold 5 elements: the first is the count of As,
        // the second is the count of Es, the third Is, the fourth Os, and the fifth Us

        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();
//        System.out.println(userInput);

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int[] vowels = new int[5];
//
        for (int i = 0; i < userInput.length(); i++) {
            char currentLet = userInput.toLowerCase().charAt(i);
//            System.out.println(currentLet);
            switch (currentLet) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
                default:
                    break;
            }
        }


        vowels[0] = countA;
        vowels[1] = countE;
        vowels[2] = countI;
        vowels[3] = countO;
        vowels[4] = countU;


        //or

//        for (int i = 0; i < userInput.length(); i++) {
//            char currentLet = userInput.toLowerCase().charAt(i);
////            System.out.println(currentLet);
//            switch (currentLet) {
//                case 'a':
//                    vowels[0]++;
//                    break;
//                case 'e':
//                    vowels[1]++;
//                    break;
//                case 'i':
//                    vowels[2]++;
//                    break;
//                case 'o':
//                    vowels[3]++;
//                    break;
//                case 'u':
//                    vowels[4]++;
//                    break;
//                default:
//                    break;
//            }
//        }

        System.out.println("The number of vowels a, e, i, o, u in the string " + userInput+" is "+ Arrays.toString(vowels));

    }
}
