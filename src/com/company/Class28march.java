package com.company;

import java.util.Scanner;

public class Class28march {

    //    public static void main(String[] args) {
//        // public- accessible throughout the project
//        // class - a blueprint for describing an object
//
//        // methods - is a vehicle or errand boy that you pass a series of instructions to
//        // and it will return the output or result to you.
//
//        //boolean evenValue = checkEven(6);
//        //System.out.println(checkEven(69) ? "Number is even": "Number is odd");
//    }
//    public static boolean checkEven(int number){
//        if(number % 2 == 0) return true;
//        else return false;
//    }
//
    // Write a method that takes in a string and returns the number of consonants in the string.
    // Input should be from the user
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a string: ");
//        String inputString = scanner.nextLine();
//
//        System.out.println("The number of vowels is " + countConsonants(inputString));
//    }
//
//
//    public static int countConsonants(String inputString) {
//        int counter = 0;
//        int spaceCount = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLet = inputString.toLowerCase().charAt(i);
//            switch (currentLet) {
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    counter++;
//                    break;
//                case ' ':
//                    spaceCount++;
//                default:
//                    break;
//            }
//        }
//        return inputString.length() - (counter + spaceCount) ;
//    }

    // Write a method that takes in an array of numbers and returns the maximum number in the array
    // do not use the Math.max() method

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter number of integers you want to use: ");
//                int intNumber = scanner.nextInt();
//
//        System.out.println(" The maximum number is: " + maxNumber(input(intNumber)));
//    }
//
//    public static int[] input(int intNumber){
//        Scanner scanner = new Scanner(System.in);
//        int[] userArr = new int[intNumber];
//        for (int i = 0; i < userArr.length; i++) {
//            System.out.print("Enter a number: ");
//            userArr[i] = scanner.nextInt();
//        }
//        return userArr;
//    }
//    public static int maxNumber(int[] userArr) {
//        int maximum = userArr[0];
//
//        for (int i = 1; i < userArr.length; i++) {
//            if (maximum < userArr[i]){
//                maximum = userArr[i];
//            }
//        }
//        return maximum;
//    }

    // Write a method that accepts three parameters, double smallNUmber, double bigNumber, String operator
    // Based on the arithmetic operator passed, perform one of the following operations: + - / *
    // on the small and big number and return the result, The result should  be a double
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an operator: ");
        String operator1 = scanner.nextLine();
        char operator = operator1.charAt(0); // you can change an operator
//        double a = 25; // you can change numbers
//        double b= 5;
        System.out.print("Please enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the second number: ");
        double b = scanner.nextDouble();

        double bigNumber ;
        double smallNumber ;
        if(a>b){
            bigNumber = a;
            smallNumber = b;
        }else{
            bigNumber = b;
            smallNumber = a;
        }
        System.out.println("The smallNumber is " + smallNumber +
                " the bigNumber is " + bigNumber + ". The result of " +
                bigNumber + " " +  operator1 + " " + smallNumber +
                " is " + result(bigNumber, smallNumber, operator));
        System.out.println(miniCalc(9, 3, '/'));
    }


    public static double result(double a, double b, char operator) {
        double c = 0;

        switch (operator) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '/':
                c = a / b;
                break;
            case '*':
                c = a * b;
                break;
            default:
                break;
        }
        return c;
    }

    public static double miniCalc(double smallNumber, double bigNumber, char operator){
        double result = 0;
        switch (operator) {
            case '+':
                return smallNumber + bigNumber;
            case '-':
                return bigNumber + smallNumber;
            case '/':
                return bigNumber / smallNumber;
            case '*':
                return bigNumber * smallNumber;
            default:
                System.out.println(operator + " operator is not valid");
                return 0;
        }
    }


}



