package com.sudiplun.oopsection2;

public class Animals {
    private String name;
    private String Color;
    private int legs;
    private boolean hasTails;
    //constructor
    public Animals(String name, String color, int legs, boolean hasTails) {
        this.name = name;
        Color = color;
        this.legs = legs;
        this.hasTails = hasTails;
    }
    public void eat (String food) {
                System.out.println("Eating " + food);
    }
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTails() {
        return hasTails;
    }

    public void setHasTails(boolean hasTails) {
        this.hasTails = hasTails;
    }
}
