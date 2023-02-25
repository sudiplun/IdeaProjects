package com.sudiplun.oopsection2;

//Inheritance feature of OOPs

public class main {
    public static void main(String[] args) {
        Bird Sparrow = new Bird("Tayla","Grey", 2, true, 2);
        System.out.println(Sparrow.getName());
        Sparrow.eat("Grain");
        System.out.println(Sparrow.getwings());
        Sparrow.fly();
    }
}

