package com.sudiplun.oopChallengeTest;
public class Organ {
    private String name;
    private String medicalcondition;

    public Organ(String name, String medicalcondition) {
        this.name = name;
        this.medicalcondition = medicalcondition;
    }

    public void getdetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Medical Condition : " + this.medicalcondition);
    }

    public String getName() {
        return name;
    }
}

