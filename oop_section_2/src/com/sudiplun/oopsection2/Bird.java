package com.sudiplun.oopsection2;

public class Bird extends Animals{
    private int wings;
    public Bird(String name, String color, int legs, boolean hasTails, int wings) {
        super(name, color, legs, hasTails);
        this.wings =wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);//Remove super.eat to override the parent class completely.
        System.out.println("Eating finished.");
    }

    public void fly(){
        System.out.println(this.getName()+" is fly.");
    }
    public int getwings() {
        return wings;
    }
    public void setWings(int wings){
        this.wings = wings;
    }
}
