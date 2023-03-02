package com.sudiplun.oopChallengeTest;

public class Eye extends Organ{
     private String color;
     private boolean isOpened;


    public Eye(String name, String medicalcondition, String color, Boolean isOpened) {
        super(name, medicalcondition);
        this.color = color;
        this.isOpened = isOpened;
    }
        public void open (){
        this.setOpened(true);
            System.out.println(this.getName() + "opened");
        }
        public void close () {
        this.setOpened(false);
            System.out.println(this.getName() + " closed");
        }
    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Color :" + this.getColor());
    }

    public String getColor() {
        return color;
    }


    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
