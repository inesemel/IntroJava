package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Class9march {
    public static void main(String[] args) {
        //Task 1: write a program that accepts a string from the user
        // and returns the number of vowels that can be found in that string
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String userString = scanner.nextLine();
//
//        char vowelA = 'a';
//        int countA = 0;
//        char vowelE = 'e';
//        int countE = 0;
//        char vowelI = 'i';
//        int countI = 0;
//        char vowelO = 'o';
//        int countO = 0;
//        char vowelU = 'u';
//        int countU = 0;

        //short solution
//        int num=0;
//        for (int i = 0; i < userString.length(); i++) {
//            char letter = userString.toLowerCase().charAt(i);
//            if ((letter == vowelA) || (letter == vowelE)||(letter == vowelI)
//                    || (letter == vowelO) || (letter == vowelU)){
//                num++;
//            }
//        }
//        System.out.println("The number of vowels is " + num);

        // a bit longer
//        for (int i = 0; i < userString.length(); i++) {
//            if (userString.toLowerCase().charAt(i) == vowelA) {
//                countA++;
//            }
//        }
//        for (int i = 0; i < userString.length(); i++) {
//            if (userString.toLowerCase().charAt(i) == vowelE) {
//                countE++;
//            }
//        }
//        for (int i = 0; i < userString.length(); i++) {
//            if (userString.toLowerCase().charAt(i) == vowelI) {
//                countI++;
//            }
//        }
//        for (int i = 0; i < userString.length(); i++) {
//            if (userString.toLowerCase().charAt(i) == vowelO) {
//                countO++;
//            }
//        }
//        for (int i = 0; i < userString.length(); i++) {
//            if (userString.toLowerCase().charAt(i) == vowelU) {
//                countU++;
//            }
//        }
//
//
//        int vowels = countA + countE + countI + countO + countU;
//        System.out.println("The number of vowels is " + vowels);


        //This is a bit shorter

//        System.out.print("Enter : ");
//        String name=scanner.nextLine();
//        Pattern pattern = Pattern.compile("[aeiuo]+");
//        Matcher matcher = pattern.matcher(name.toLowerCase());
//
//        int cou = 0;
//        while (matcher.find()) {
//            cou++;
//        }
//        System.out.println("The result is " + cou);
//
//        //Prompt a user for a string
//        System.out.print("Please enter a string: ");
//        String inputString = scanner.nextLine();

        //initialize a counter variable to count the vowel occurences
//        int counter = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLet = inputString.toLowerCase().charAt(i);
//            switch (currentLet) {
//                case 'a':
//                    counter++;
//                    break;
//                case 'e':
//                    counter++;
//                    break;
//                case 'i':
//                    counter++;
//                    break;
//                case 'o':
//                    counter++;
//                    break;
//                case 'u':
//                    counter++;
//                    break;
//                default:
//                    break;

//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    counter++;
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.println("The number of vowels is " + counter);

        //
//        System.out.print("Enter the first one string: ");
//        String userString = scanner.next();
//        Pattern pattern1 = Pattern.compile("[a]+");
//        Matcher matcher1 = pattern1.matcher(userString.toLowerCase());
//        Pattern pattern2 = Pattern.compile("[e]+");
//        Matcher matcher2 = pattern2.matcher(userString.toLowerCase());
//        Pattern pattern3 = Pattern.compile("[i]+");
//        Matcher matcher3 = pattern3.matcher(userString.toLowerCase());
//        Pattern pattern4 = Pattern.compile("[o]+");
//        Matcher matcher4 = pattern4.matcher(userString.toLowerCase());
//        Pattern pattern5 = Pattern.compile("[u]+");
//        Matcher matcher5 = pattern5.matcher(userString.toLowerCase());
//
//        int count;
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;
//        int count5 = 0;
//        while (matcher1.find()) {
//            count1++;
//        }
//        while (matcher2.find()) {
//            count2++;
//        }
//        while (matcher3.find()) {
//            count3++;
//        }
//        while (matcher4.find()) {
//            count4++;
//        }
//        while (matcher5.find()) {
//            count5++;
//        }
//
//        count = count1 + count2 + count3 + count4 + count5;
//        System.out.println("The result is " + count);

        //Task 2: write a program that accept 5 numbers from a user AS STRINGS.
        //DO NOT USE THE nextInt() method
        //Ad the first 2 numbers and subtract the second 2 numbers
        //and multiply the result of the calculation above
        // and divide the result by the last number and print interactively


//        System.out.print("Enter the first number: ");
//        String a=scanner.next();
//        System.out.print("Enter the second number: ");
//        String b=scanner.next();
//        System.out.print("Enter the third number: ");
//        String c=scanner.next();
//        System.out.print("Enter the fourth number: ");
//        String d=scanner.next();
//        System.out.print("Enter the fifth number: ");
//        String e=scanner.next();
//
//        double a1= Double.parseDouble(a);
//        double b1= Double.parseDouble(b);
//        double c1= Double.parseDouble(c);
//        double d1= Double.parseDouble(d);
//        double e1= Double.parseDouble(e);
//
//        double result;
//        result= ((a1 + b1) * (c1 - d1))/ e1;
//        System.out.println("The result is " + result);



        System.out.print("Please enter an operator: ");
        String operator1 = scanner.nextLine();
        char operator = operator1.charAt(0); // you can change an operator
//        double a = 25; // you can change numbers
//        double b= 5;
        System.out.print("Please enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the second number: ");
        double b = scanner.nextDouble();
        double c;
        switch (operator){
            case '+':
            c = a + b;
            System.out.println(c);
            break;
        case '-':
            c = a - b;
            System.out.println(c);
            break;
        case '/':
            c = a / b;
            System.out.println(c);
           break;
        case '*':
            c = a * b;
            System.out.println(c);
            break;
        default:
            System.out.println("There is no suitable mathematical operation");
        }

    }
}
