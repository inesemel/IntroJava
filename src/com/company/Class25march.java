package com.company;

import java.util.Scanner;

public class Class25march {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1:
        //Write a program that takes in the weight and height of 5 people from the user
        //and returns the average BMI of the group

//        double[] weight = new double[5];
//        double[] height = new double[5];
//        for (int i = 0; i < height.length; i++) {
//            System.out.print("Enter the weight of the person No. " + (i + 1) + " ");
//            weight[i] = scanner.nextDouble();
//            System.out.print("Enter the height of the person No. " + (i + 1) + " ");
//            height[i] = scanner.nextDouble();
//        }
//
//        double[] bmi = new double[5];
//        for (int i = 0; i < bmi.length; i++) {
//            bmi[i] = weight[i]/Math.pow(height[i],2);
//        }
//
//        double sum = 0;
//        double average;
//        for (int i = 0; i < bmi.length; i++) {
//            sum+=bmi[i];
//        }
//        average = sum/5;
//        System.out.println("The average BMI of the group: " + average);
        //Task2:
        //Given a string of a user return the character and count of the character
        // that occurs the most in the string


//        String str = "grass is greener on the other side";
//        System.out.print("Enter a string: ");
//        String userStr = scanner.nextLine();
//        int[] freq = new int[userStr.length()];
//        char minChar = userStr.charAt(0);
//        char maxChar = userStr.charAt(0);
//        int  min, max;

        //Converts given string into character array
//        char string[] = userStr.toCharArray();

        //Count each word in given string and store in array freq
//        for(int i = 0; i < string.length; i++) {
//            freq[i] = 1;
//            for(int j = i + 1; j < string.length; j++) {
//                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
//                    freq[i]++;
//
//                    //Set string[j] to 0 to avoid printing visited character
//                    string[j] = '0';
//                }
//            }
//        }

        //Determine minimum and maximum occurring characters
//        min = max = freq[0];
//        for(int i = 0; i <freq.length; i++) {

            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
//            if(min > freq[i] && freq[i] != '0') {
//                min = freq[i];
//                minChar = string[i];
//            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
//            if(max < freq[i]) {
//                max = freq[i];
//                maxChar = string[i];
//            }
//        }
//
////        System.out.println("Minimum occurring character: " + minChar);
//        System.out.println("Maximum occurring character: " + maxChar + " and it occurred " + max + " time");



        //Task3:
        //You are sent to a grocery store with the following items on your list ["Bananas", "Bread", "Fish"]
        // The cost of the items in the store is [12, 5, 10], your current cash-in-hand is 20 dollars.
        //Which of the items can you safely buy without needing extra cash.
        //Priority - Bananas[least], fish[second], bread[first]

        String[] items = {"Bananas", "Bread", "Fish"};
        int[] price = {12, 5, 10};
        int[] howMuch = new int[3];
        int[] left = new int[3];

        for (int i = 0; i < price.length; i++) {

            howMuch[i] = 20 / price[i];
            left[i] = 20 - howMuch[i]*price[i];
        }

        System.out.println("You can buy " + howMuch[0] + " pieces of " + items[0] + " and will be left  with " );
        //Dates
        // receive the year, month and day from the user separately
        // the year should be a four-digit number.
        // assume that date is correct
        //Determine if the date is a magic date
        //A magic date occurs when:
        //- m * d is a 1 digit-number that matches the last digit of the year, or
        //- m * d is a 2-digit number that matches the last 2 digits of the year, or
        //-  m * d is a 3-digit number that matches the last 3 digits of the year

//        System.out.println("Enter the year: ");
//        int year = scanner.nextInt();
//        String yearStr = Integer.toString(year);
//        if(yearStr.length() != 4){
//            System.out.println("Incorrect year! Year must contain 4 digits!");
//        } else{
//            System.out.println("Enter the month: ");
//            int month = scanner.nextInt();
//            if (month < 1 || month > 12){
//                System.out.println("Incorrect month!");
//            } else {
//                System.out.println("Enter the day: ");
//                int day = scanner.nextInt();
//                if (day < 1 || day > 31){
//                    System.out.println("Incorrect date of day!");
//                } else {
//
//                    int monthDay = month * day;
//                    String monthDayString = Integer.toString(monthDay);
//                    if (monthDayString.length() == 3 && monthDayString.charAt(0) == yearStr.charAt(1) &&
//                            monthDayString.charAt(1) == yearStr.charAt(2) &&
//                            monthDayString.charAt(2) == yearStr.charAt(3)){
//                        System.out.println("It's a magic date");
//                    } else if (monthDayString.length() == 2 && monthDayString.charAt(0) == yearStr.charAt(2) &&
//                            monthDayString.charAt(1) == yearStr.charAt(3)) {
//                        System.out.println("It's a magic date");
//                    } else if (monthDayString.length() == 1 && monthDayString.charAt(0) == yearStr.charAt(3)){
//                        System.out.println("It's a magic date");
//                    } else {
//                        System.out.println("It's not a magic date");
//                    }
//
//                }

        // Task 5
        // Draw a flow chart that checks if  2 numbers that are entered are divisible by 5

        // task 6
        // Draw a flowchart to return fibonacci numbers between 1 - 30
            }
        }








