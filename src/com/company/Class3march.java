package com.company;

public class Class3march {
    public static void main(String[] args) {
        // continue - used to skip an iteration (one movement loop)
        // break = used to stop the loop immediately
        // return - typically
//        for (int i = 1; i < 20; i++){
//            if (i % 2 != 0) {
//                continue;
//                break;
//            }
//            System.out.println(i);
//        }
        //A string is basically anything inside of double - quotes ("")
        //Strings are immutable. This means they can not be changed.
        // String in java is case-sensitive because it sees upperCase
        // alphabet and lowerCase differently
//        System.out.println("I love coding"); // Strings literal

        //There are two main ways to create strings
//        String objectString = new String("I am going home"); // this type takes more space and is unideal
//        String regularString = "I am going to the beach";

//        System.out.println(regularString.length());

        // the index of the first character in a string is 0
        // the index of the last character is N - 1
//        int counter = 0;
//        for(int i = 0; i< regularString.length(); i++){
//            System.out.println(regularString.toLowerCase().charAt(i));
//            if('a'== regularString.charAt(i)){
//                counter++;
//            }
//        }
//        System.out.println("The number of times 'a' appeared is " + counter);

        //Task 1:
        // write a program to count the number of times a vowel appears in a word.
        //Physician
        //Aerodynamics

        String regularStringOne = "Aerodynamics";
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for(int i = 0; i< regularStringOne.length(); i++){
            System.out.println(regularStringOne.toLowerCase().charAt(i));
            if('a'== regularStringOne.charAt(i)){
                counter1++;
            }
            if('e'== regularStringOne.charAt(i)){
                counter2++;
            }
            if('i'== regularStringOne.charAt(i)){
                counter3++;
            }
            if('o'== regularStringOne.charAt(i)){
                counter4++;
            }
            if('u'== regularStringOne.charAt(i)){
                counter5++;
            }
        }
        System.out.println("The number of times 'a' appeared in the word " + regularStringOne + " is " + counter1);
        System.out.println("The number of times 'e' appeared in the word " + regularStringOne + " is " + counter2);
        System.out.println("The number of times 'i' appeared in the word " + regularStringOne + " is " + counter3);
        System.out.println("The number of times 'o' appeared in the word " + regularStringOne + " is " + counter4);
        System.out.println("The number of times 'u' appeared in the word " + regularStringOne + " is " + counter5);

    }
}
