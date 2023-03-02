package com.sudiplun.oopsection3;

public class Car {
    private String name;
    private String color;
    private int doors;
    private Engine engine;

    public Car(String name, String color, int doors, Engine engine) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * Return the engine of our Engine
     * @return
     */
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
