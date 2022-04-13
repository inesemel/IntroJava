package com.company.oop.homework10;

public class homework10 {
//    Create a class called Person(Parent class). They should have:
//    name, age.
//    Create a class called Employee(Child class).
//    This class should inherit the Person class. and should have the extra fields:
//    company id, company name.
//    Create a class called Company. This class should take in employees as
//            an array attribute,  and have a name.
//    In your main method, Populate a company’s employees attribute and find the average age of the employees.

    public static void main(String[] args) {


        Employee[] employees = new Employee[]{
                new Employee("Katarina", 23, "222", "Sunny Holidays"),
                new Employee("James", 31, "333", "Moonlight"),
                new Employee("Kate", 28, "444", "Solar System"),
        };

        Company company = new Company(employees);
        System.out.println(company.getAverageAge());

        // Assuming you were assigning a task to create a roster for employees that will decide
        // who will work the night shift based on a random basis.
        // Write a method in your company object/class that
        // will return a random employee, from the list of employees anytime the method is called.

        System.out.println(company.getRandom());
    }

}
