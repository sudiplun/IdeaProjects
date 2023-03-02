package com.sudiplun.interfacesclass;

public class Main {
    public static void main(String[] args) {
CarInterface carInterface =  new ElectricCar("Tesla");
carInterface.start();
carInterface.move(70);
CarInterface fossilCarInterface = new FossilFuelCar("Ford");
fossilCarInterface.start();
fossilCarInterface.move(40);

    }
}
