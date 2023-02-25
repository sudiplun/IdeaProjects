package com.sudiplun.oopsection1;

public class Phone {
    //String name;
    private String name;
    private int screenSize;
    private int memory;
   private int camera;
//Constructor started here.
    public Phone( String name, int screenSize, int memory, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memory = memory;
        this.camera = camera;
    } //constructor ended here.
    //second constructor
    public Phone(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    public void playMusic(String trackName) {
        System.out.println("Playing " + trackName);
    }
    // Getter and Setter to access the private inner class's property.
  public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
