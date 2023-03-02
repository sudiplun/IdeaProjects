package com.sudiplun.oopChallengeTest;

public class Heart extends Organ {
    private int Rate;

    public Heart(String name, String medicalcondition, int rate) {
        super(name, medicalcondition);
        Rate = rate;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Heart rate: " + this.getRate());
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }
}
