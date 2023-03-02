package com.sudiplun.oopChallengeTest;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalcondition, boolean isEmpty) {
        super(name, medicalcondition);
        this.isEmpty = isEmpty;
    }
    public void digest (){
        System.out.println("Digesting begin......!");
    }

    @Override
    public void getdetails() {
        super.getdetails();
        if (this.isEmpty()) {
            System.out.println("Stomach needed to fed");
        } else {
            System.out.println("Stomach is full.");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
