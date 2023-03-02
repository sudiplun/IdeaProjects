package com.sudiplun.oopChallengeTest;

public class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalcondition, String color, int softness) {
        super(name, medicalcondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Skin Color " + this.getColor());
    }

    public String getColor() {
        return color;
    }
}
