package com.company;

public class Homework2 {
    public static void main(String[] args) {
        //Task1: Write a program to compare two strings
        // by their length and return output that tells
        // the user if the strings are equal or not.

        String string1="Today is Sunday";
        String string2="It is a bit cloudy today";

        int a = string1.length();
        int b = string2.length();

        if (a == b){
            System.out.println("The length of the strings is equal.");
        } else{
            System.out.println("The length of the strings is not equal.");
        }


        // Task 2: Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.


        String str = "burp";
        int n = 3;
        String str1 = "";

        for (int i=1; i<= n-1; i++){
            str1= str1 + "r";
        }
        System.out.println(str.substring(0, 2) + str1 + str.substring(2, str.length()));

        //Task 3: Write a program to remove the first and last letters of a string.
        // e.g. hello becomes ell

        String string3="teacher";
        System.out.println(string3 = string3.substring(1, string3.length() - 1));


        //Task 4: Write a program to reverse a string and capitalize all the letters.
        // e.g. hello becomes OLLEH.

        String string4 = "homework";
        String string5 = "";
        for (int j=(string4.length()-1); j>=0; j--){
            string5 = string5 + string4.charAt(j);
        }
        System.out.println(string5.toUpperCase());
    }
}
