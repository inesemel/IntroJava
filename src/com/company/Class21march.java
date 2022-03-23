package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import java.time.Month;

public class Class21march {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task1:
        //ask a user to enter the sides of a right-angled triangle, a, b, c
        //find the area of the triangle.
//        double[] triangleSides = new double[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter a side of triangle: ");
//            triangleSides[i] = scanner.nextInt();
//        }
//        Arrays.sort(triangleSides);
//        if(triangleSides[0] + triangleSides[1] > triangleSides[2] &&
//                triangleSides[0] + triangleSides[2] > triangleSides[1] &&
//                triangleSides[1] + triangleSides[2] > triangleSides[0] &&
//        Math.pow(triangleSides[0],2) + Math.pow(triangleSides[1],2) == Math.pow(triangleSides[2],2)){
//            Arrays.sort(triangleSides);
//            double area = triangleSides[0] * triangleSides[1] * 0.5;
//            System.out.println("The area of triangle is: " + area);
//        } else{
//            System.out.println("This triangle does not exist!");
//        }

        //Task2:
        //write a program to return the fibonacci sequence up to a specified length by the user

//        System.out.println("Please enter the length of fibonacci sequence: ");
//        int[] sequence = new int[scanner.nextInt()];
//
//        if(sequence.length < 1){
//            System.out.println("Inappropriate length of the sequence!");
//        }else if(sequence.length == 1){
//            sequence[0] = 0;
//            System.out.println("Fibonacci sequence: " + Arrays.toString(sequence));
//        } else if (sequence.length == 2){
//            sequence[0] = 0;
//            sequence[1] = 1;
//            System.out.println("Fibonacci sequence: " + Arrays.toString(sequence));
//        } else {
//            sequence[0] = 0;
//            sequence[1] = 1;
//            for (int i = 2; i < sequence.length; i++) {
//                sequence[i] = sequence[i - 1] + sequence[i - 2];
//            }
//            System.out.println("Fibonacci sequence: " + Arrays.toString(sequence));
//        }

        //Date is the class under the java.util
        //It contains tools for managing and manipulating dates
        Date date = new Date();

        //deprecated means that something is no longer in use.


//        System.out.println(date.getTime());
//
//        LocalTime timeLocal = LocalTime.now();
//        System.out.println(timeLocal);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);


        //A leap year is a year with an additional day in it, because of the month of february.
        //Write a program that accepts a year from a user and tells the user if the year is a leap year or not.

//        System.out.print("Please enter the year: ");
//        int year = scanner.nextInt();
//        if ((year % 4 == 0) && (year % 100!= 0) || (year % 400 == 0 )){
//            System.out.println(year + " is a leap year");
//        } else{
//            System.out.println(year + " is not a leap year");
//        }

//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();

//        boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

//        System.out.println(isLeap ? "Leap year" : "not leap year");
//        boolean isLeap = LocalDate.of(year, Month.DECEMBER, 2).isLeapYear();
//        System.out.println(isLeap ? "local leap year": "not leap");

        //Write a program that returns the number or amount of hours between two (o'clock) times entered by a user.
        System.out.print("Enter the start hour: ");
        String userStart = scanner.nextLine(); // 5:00 AM

        System.out.print("Enter the end hour: ");
        String userEnd = scanner.nextLine(); // 8:00 AM

        // Get the value of the hours
        int startHour = Integer.parseInt(userStart.split(":")[0]);
        int endHour = Integer.parseInt(userEnd.split(":")[0]);

        System.out.println(startHour);
        // If a time entered is in the morning assign it 12 else assign it 24
        // to make it easy to compare numerically.
        int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24;
        int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

        // subtract and find out the difference
        int difference =(endHour+amPmTwo) - (startHour+amPmOne);
        if (amPmOne < amPmTwo && startHour > endHour) difference +=12;


        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");




    }
}
