package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Class7march {
    public static void main(String[] args) {
        //Scanner
        //Initialize the scanner class
        Scanner  scanner = new Scanner(System.in);
//
//        //Prompt the user to perform an action
//        System.out.print("Enter your name: ");
//        String userInput = scanner.next(); //Accept the user's input and save it to a variable
//
//        System.out.println(userInput);
//        scanner.close();

        //Task1: Write a program to compare two strings
        // by their length and return output that tells
        // the user if the strings are equal or not.
        System.out.print("Enter the first one string: ");
//        String userInput = scanner.next();
        String string1=scanner.next();
        System.out.print("Enter the second one string: ");
        String string2=scanner.next();

        int a = string1.length();
        int b = string2.length();

        if (a == b){
            System.out.println("The length of the strings is equal.");
        } else{
            System.out.println("The length of the strings is not equal.");
        }

//        if (string1.equals(string2)){
//            System.out.println("The length of the strings is equal.");
//        } else{
//            System.out.println("The length of the strings is not equal.");
//        }

        // Task 2: Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.

        System.out.println("The given word is 'burp' ");
        System.out.print("Enter the number of extra r's: ");
        int n= scanner.nextInt();
        //String number=scanner.next();
        String str = "burp";
        String str1 = "";
        //int n=Integer.parseInt(number);

        for (int i=1; i<= n-1; i++){
            str1= str1 + "r";
        }
        System.out.println("Now it looks like " + str.substring(0, 2) + str1 +
                str.substring(2, str.length()));

//        String rString = ""; //this is going to contain the r's
//        int rNumber = 4;
//        for (int k = 0; k < rNumber; k++){
//            rString+= "r";//rString = rString + "r"; // append r's to the rString
//        }
//         System.out.println("bu" + rString + "p");


        //Task 3: Write a program to remove the first and last letters of a string.
        // e.g. hello becomes ell

        System.out.print("Enter the word: ");

        String string3= scanner.next();
        System.out.println("Now it looks like " + string3.substring(1, string3.length() - 1));


        //Task 4: Write a program to reverse a string and capitalize all the letters.
        // e.g. hello becomes OLLEH.

        System.out.print("Enter the word ");

        String string4 = scanner.next();
        String string5 = "";
        for (int j=(string4.length()-1); j>=0; j--){
            string5 = string5 + string4.charAt(j);
//            string5 += string4.charAt(j);
        }
        System.out.println("Now it looks like " + string5.toUpperCase());

        //Escape characters:
        //Escape characters are special characters that allow usto
        //perform specials from within a string
        // \n = this creates a new line
        System.out.println("This is the first line\nThis is the second line");
        // \t = a new tab
        // \r = carriage turns (does the same thing as pressing enter)

        System.out.println("The little \"brown\" dog");

        //Wrapper classes (string to primitive classes)
        // String number = "5";
        //int n=Integer.parseInt(number) ;  convert string to integer

        String six = "6.00001";
        double sixValue = Double.parseDouble(six);

        String falseString = "false";
        boolean falseValue = Boolean.parseBoolean(falseString);

        //Regex
        //Quantifiers are a construct under regex that allows us to
        // take note of the number of occurences of a particular sequences in a string
        // + - checks if a character or sequence has at least one occurence in the string
        // a+bc -> checks if there is at least one a in the string being tested
        // * - checks if a character appears zero or more times
        // ? - checks if a character appears zero or one time

        Pattern pattern = Pattern.compile("[ad]+"); // Pattern checker
        Matcher matcher= pattern.matcher("adad"); // String to check
        System.out.println(matcher.matches()); // this return tru if they match and false if not
    }
}
