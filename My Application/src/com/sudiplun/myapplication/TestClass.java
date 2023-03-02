package com.sudiplun.myapplication;

public class TestClass {
    public static String name;
    public int age;
    public String skincolor;

    public TestClass(int age, String skincolor) {
        this.age = age;
        this.skincolor = skincolor;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }
}
