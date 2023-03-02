package com.sudiplun.oopChallengeTest;

public class Patient {
    private String name;
    private int age;
    private Eye lefteye;
    private Eye righteye;
    private Heart heart;
    private Skin skin;
    private Stomach stomach;

    public Patient(String name, int age, Eye lefteye, Eye righteye, Heart heart, Skin skin, Stomach stomach) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.skin = skin;
        this.stomach = stomach;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLefteye() {
        return lefteye;
    }



    public Eye getRighteye() {
        return righteye;
    }



    public Heart getHeart() {
        return heart;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Stomach getStomach() {
        return stomach;
    }

}
