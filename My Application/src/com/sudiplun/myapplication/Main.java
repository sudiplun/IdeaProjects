package com.sudiplun.myapplication;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(28, "bab");
        TestClass.name = "sudip";
        System.out.println(testClass.getName());
    }
}
