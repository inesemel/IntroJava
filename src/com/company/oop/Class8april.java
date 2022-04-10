package com.company.oop;

public class Class8april {
    //Create a new class called Rectangle and in the class, define two properties of a
    // rectangle which are the length and the breadth. Create a constructor to allow instantiation
    // of the rectangles at object creation and also write methods to find the perimeter and area of the rectangle

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(8, 10);
//
//        System.out.println("The perimeter of the rectangle is " + rectangle.perimeter());
//        System.out.println("The area of the rectangle is " + rectangle.area());





    // Write a method that takes an array of 5 Persons as a parameter and then returns
    // the average age of the array of Persons as its output.

//        Person[] people = new Person[] {
//                new Person("George", 22, 1.6, 55),
//                new Person("Fred", 18, 1.6, 55),
//                new Person("David", 20, 1.6, 55),
//
//        };
//        People persons = new People(people);
//        System.out.println(persons.getAverageAge());



    // Write two classes
    // Animal class Fields - String type, String number of legs
    // Methods - String sounds it makes, movement

    // Bird - fields: color, doesItFly
    // Methods - fly (), sing()


        Animal animal1 = new Animal();
        System.out.println(animal1.sound());
        System.out.println(animal1.movement());

        Bird bird = new Bird();
        System.out.println(bird.song());
        System.out.println(bird.canFly());
    }
}
