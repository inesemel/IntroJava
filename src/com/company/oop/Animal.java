package com.company.oop;

public class Animal {
    private String type = "insect";
    private String numOfLegs = "6";
    private String sound;
    private String movement;

    public String sound(){
        if (type.equals("insect")){
            sound =  "Bzzz";
        }
        return sound;
    }

    public String movement(){
        if(numOfLegs.equals("6")){
            movement = "walking";
        }
        return movement;
    }



}
