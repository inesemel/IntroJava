package com.company.oop;


public class Rectangle {

    private double length;
    private double breadth;



    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
    public double perimeter(){
        double length = getLength();
        double breadth = getBreadth();
        return (2 * length + 2 * breadth);
    }
    public double area(){
        double length = getLength();
        double breadth = getBreadth();
        return (length * breadth);
    }
}
