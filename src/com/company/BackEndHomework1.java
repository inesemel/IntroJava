package com.company;

import java.util.Scanner;

public class BackEndHomework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //'+' for addition, '-' for subtraction, '*' for multiplication,
        // '/' for division, '^' for exponentiation, 's' for square root.
//        System.out.print("Please enter an operator '+', '-', '*', '/', '^', 's': ");
//        String operator1;
//        char operator;
//        System.out.print("Please enter the first number: ");
        double a;
//        System.out.print("Please enter the second number: ");
        double b;
        double c;
        boolean continueLoop = true;
//        String yes = "1";
        while (continueLoop) {
            System.out.print("Please enter an operator '+', '-', '*', '/', '^', 's': ");

            String operator1 = scanner.next();
            char operator = operator1.charAt(0);
            switch (operator) {
                case '+':
                    System.out.print("Please enter the first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Please enter the second number: ");
                    b = scanner.nextDouble();
                    c = a + b;
                    System.out.println("The result is " + c);
                    break;
                case '-':
                    System.out.print("Please enter the first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Please enter the second number: ");
                    b = scanner.nextDouble();
                    c = a - b;
                    System.out.println("The result is " + c);
                    break;
                case '/':
                    System.out.print("Please enter the first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Please enter the second number: ");
                    b = scanner.nextDouble();
                    if(b != 0){
                        c = a / b;
                        System.out.println("The result is " + c);
                        break;
                    } else {
                        System.out.println("Error!");
                        break;
                    }
                case '*':
                    System.out.print("Please enter the first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Please enter the second number: ");
                    b = scanner.nextDouble();
                    c = a * b;
                    System.out.println("The result is " + c);
                    break;
                case '^':
                    System.out.print("Please enter the first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Please enter the second number: ");
                    b = scanner.nextDouble();
                    c = Math.pow(a, b);
                    System.out.println("The result is " + c);
                    break;
                case 's':
                    System.out.print("Please enter the number: ");
                    a = scanner.nextDouble();
                    c = Math.sqrt(a);
                    System.out.println("The result is " + c);
                    break;
                default:
                    System.out.println("There is no suitable mathematical operation");
            }
            System.out.print ("If you want to continue please enter 'yes': ");
            String yes = scanner.next();
            if (!yes.equals("yes")){
                continueLoop = false;
            }
        }
    }
}
