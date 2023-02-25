package com.sudiplun.oopsection1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 14", 5, 256, 24);//to supply the property to the constructor class
//        iPhone.name = "iPhone 14";
       // iPhone.setName("iPhone 14");
        System.out.println(iPhone.getName());
        // iPhone.memory = 256; // for public class property.
        iPhone.playMusic ("Drag me Down");

        //providing senond constructor value
        Phone Vivo = new Phone("vivo 1920", 128);
        System.out.println(Vivo.getName());

    }
}
