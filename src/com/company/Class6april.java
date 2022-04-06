package com.company;

import com.company.oop.Person;

public class Class6april {
    public static void main(String[] args) {
//    Person victoria = new Person("Victoria", );

    Person victoria = new Person("Victoria", 20, 1.6, 55.0);
//        victoria.setName("Victoria");
//    Person george = new Person("George", 32, 1.8, 80.0);
//        george.setName("George");
        System.out.println(victoria.bmi());
//        System.out.println(victoria.getName());
    }

}
