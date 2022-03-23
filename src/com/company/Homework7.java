package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.time.Month;
import java.time.Period;

public class Homework7 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        // Task1:
        // Write a Java program to get year and months between two dates.

//        System.out.print("Enter a year: ");
//        int yearOne = scanner.nextInt();
//        System.out.print("Enter a month: ");
//        String monthOne = scanner.next();
//
//        System.out.print("Enter a year: ");
//        int yearTwo = scanner.nextInt();
//        System.out.print("Enter a month: ");
//        String monthTwo = scanner.next();


        // Does not work. Cannot use LocalDate out of the statement

//        if (monthOne.equals("JANUARY")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.JANUARY, 15);
//        } else if (monthOne.equals("FEBRUARY")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.FEBRUARY, 15);
//        } else if (monthOne.equals("MARCH")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.MARCH, 15);
//        } else if (monthOne.equals("APRIL")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.APRIL, 15);
//        } else if (monthOne.equals("MAY")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.MAY, 15);
//        } else if (monthOne.equals("JUNE")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.JUNE, 15);
//        } else if (monthOne.equals("JULY")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.JULY, 15);
//        } else if (monthOne.equals("AUGUST")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.AUGUST, 15);
//        } else if (monthOne.equals("SEPTEMBER")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.SEPTEMBER, 15);
//        } else if (monthOne.equals("OCTOBER")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.OCTOBER, 15);
//        } else if(monthOne.equals("NOVEMBER")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.NOVEMBER, 15);
//        } else if (monthOne.equals("DECEMBER")){
//            LocalDate dateOne = LocalDate.of(yearOne, Month.DECEMBER, 15);
//        }
//
//        if (monthTwo.equals("JANUARY")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.JANUARY, 15);
//        } else if (monthTwo.equals("FEBRUARY")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.FEBRUARY, 15);
//        } else if (monthTwo.equals("MARCH")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.MARCH, 15);
//        } else if (monthTwo.equals("APRIL")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.APRIL, 15);
//        } else if (monthTwo.equals("MAY")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.MAY, 15);
//        } else if (monthTwo.equals("JUNE")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.JUNE, 15);
//        } else if (monthTwo.equals("JULY")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.JULY, 15);
//        } else if (monthTwo.equals("AUGUST")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.AUGUST, 15);
//        } else if (monthTwo.equals("SEPTEMBER")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.SEPTEMBER, 15);
//        } else if (monthTwo.equals("OCTOBER")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.OCTOBER, 15);
//        } else if(monthTwo.equals("NOVEMBER")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.NOVEMBER, 15);
//        } else if (monthTwo.equals("DECEMBER")){
//            LocalDate dateTwo = LocalDate.of(yearTwo, Month.DECEMBER, 15);
//        }

        // The code down below works
//        LocalDate dateOne = LocalDate.of(2001, Month.JANUARY, 15);
//        LocalDate dateTwo = LocalDate.of(2022, Month.DECEMBER, 15);
//        Period difference = Period.between(dateOne, dateTwo);
//        System.out.println("Difference between "+ dateOne +" and "+ dateTwo +" is: "
//                + difference.getYears() +" Year/-s and "+ difference.getMonths() +" Month/-s");

        //Task2:
        //Write a Java program to calculate the difference between two dates in days.


//        System.out.println();
//        String sDateOne="20/05/2022";
//        String sDateTwo = "25/05/2022";
//        Date dateOne = new SimpleDateFormat("dd/MM/yyyy").parse(sDateOne);
////        System.out.println(sDateOne+"\t"+date1);
//
//
////        System.out.println(dateOne.getTime());
//        Date dateTwo=new SimpleDateFormat("dd/MM/yyyy").parse(sDateTwo);
//
//        if (dateOne.getTime() > dateTwo.getTime()){
//            System.out.println("Difference in days is " +
//                    (dateOne.getTime() - dateTwo.getTime())/1000/60/60/24 + " days");
//        } else{
//            System.out.println("Difference in days is " +
//                    (dateTwo.getTime() - dateOne.getTime())/1000/60/60/24 + " days");
//        }

        // Another solution

//        LocalDate userDateOne = LocalDate.of(2001, Month.JANUARY, 15);
//        LocalDate userDateTwo = LocalDate.of(2022, Month.DECEMBER, 15);
//
//        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDateOne, userDateTwo));
//        System.out.println("Difference in days is " + numberOfDaysBetween);

        //Task1:
        //Write a program to calculate the age of a person, considering that they only enters
        //their date of birth.

        System.out.print("Enter your date of birth yyyy-mm-dd");
        String date2 = scanner.next();
        LocalDate dateOne = LocalDate.now();
//        LocalDate dateTwo = LocalDate.of(1999, Month.MAY, 25);
        LocalDate dateTwo = LocalDate.parse(date2);
        Period difference = Period.between(dateTwo, dateOne);
        System.out.println("You are " + difference.getYears() +" years old");

        //Task2:
        //Write a program to calculate the number of days between two specified years.

        LocalDate userDateOne = LocalDate.of(2020, Month.JANUARY, 15);
        LocalDate userDateTwo = LocalDate.of(2022, Month.JANUARY, 15);

        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDateOne, userDateTwo));
        System.out.println("Difference in days is " + numberOfDaysBetween);

    }

}
