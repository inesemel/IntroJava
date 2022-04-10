package com.company.oop;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Persons {

    private String name;
    private int age;

    public List list(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Object>> listOfPersons= new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {

                System.out.print("Enter the name ");
                listOfPersons.get(i).add(0, scanner.next());
                System.out.print("Enter age ");
                listOfPersons.get(i).add(1, scanner.next());

        }

        return listOfPersons;
    }
}
