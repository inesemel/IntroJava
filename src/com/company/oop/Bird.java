package com.company.oop;

public class Bird extends Animal {
    private String color;
    private boolean fly = true;

    public String canFly(){
        if (fly) {
            return "This bird can fly";
        } else {
            return "This bird cannot fly";
        }
    }

    public String song(){
        return "Chirrr";
    }

}
