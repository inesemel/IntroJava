package com.company;

public class Conditionals {

    public static void main(String[] args){
    //conditionals is simply a way of telling the computer to perform certain actions based on
    // certain conditions.
//    int number =2;
//    if(number ==2 ){
//        System.out.println("The value is 2");
//    } else {
//        System.out.println("The value is not 2");
//    }
//
//    int numberOne =8;
//    if(numberOne > 9){
//        System.out.println("The value is greater than 9");
//    } else {
//        System.out.println("The value is not greater than 9");
//    }
//    int value =11;
//        if (value == 11){
//            System.out.println(value + " The value is 11");
//        } else if (value > 9 && value<15){
//            System.out.println("The value is not greater than 9");
//        } else if (value <9 ){
//            System.out.println("The value is greater than 9 and less than 14");
//        } else {
//            System.out.println("The value is not greater than 9 or less than 14");
//        }


        // Loops are a construct that allows us to repeat a set of
        //commands until a condition to terminate is reached.
        // Do - While loop is basically saying do this for as long the condition is true

//        int count = 0
//        do{
//            System.out.println(count); //print the count
//            count = count + 1 ; // increase the count by 1
//        } while (count < 10);
        // while loop is basically saying do this while statement is true

        // PRO - TIP: use while loop when you don't know how many times the loop is going to run.
//        while (count < 11){
//            System.out.println(count);
//            count = count +1;
//        }
         //For loop
        //use the for loop typically when you have an idea how many
        // times the loop is supposed to run

//        for (int i= 0; i<15; i++){
//            if (i>9)
//
//            System.out.println(i + " is greater than 9");
//        }
//

        // Task 1: write a program using a loop that prints out 'even' when an even
        // number is encountered between 1- 50 and odd when an odd number is encountered as well.


//        for (int i = 1; i < 51; i++){
//            if (i % 2 == 0) {
//                System.out.println(i + " is an even number");
//            } else{
//            System.out.println(i + " is an odd number");}
//        }

        //Task2: write a program using a while loop that will print out all the
        //multiples of 4 between 1 and 50

//        int count = 0;
//        int a = 0;
//
//        while ( a <= 50){
//           System.out.println(a);
//           count = count +1; // post- incrementation
//           a= count*4;
//       }


        //Unary operators:
        // pre- incrementation operators e.g. ++counter is the same as counter = counter +1 before
        // the value  is read
        // post- incrementation operators counter++

        //Subtraction
        //pre- decrementation operators --counter
        // post- decrementation operators counter--

        // Task 3: write a program that prints numbers 1 to 50
        // and if the number is divisible by 3 then replace that number with the word 'Fizz'
        // and if a number is divisible by 7 than replace that number with the word 'Buzz'
        //and if the number is divisible both by 3 and 7 than replace that number with the word 'FizzBuzz'
        // else just print the number

        for (int i = 1; i < 51; i++){
            if (i % 3 == 0 || i % 7 == 0) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 ) {
                    System.out.println("Fizz");
                } else {
                    System.out.println("Buzz");
                }
            } else{
                System.out.println(i);}
        }



    }

}
