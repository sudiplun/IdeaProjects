package com.sudiplun.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //Assign the name to array
        names.add("Sudip");
        names.add("Ram");
        names.add("Sita");
        names.add("nakull");
//        System.out.println(names.get(0));//to get index 1 of array
//        System.out.println(names.size());
        //  names.clear();//clear the array
//        names.remove("Ram");
//        System.out.println(names.contains("Ram"));
//        System.out.println(names.isEmpty());
       // System.out.println(names.indexOf("nakull"));
//        for (int i=0; i< names.size(); i ++) {
//            System.out.println(names.get(i));
//        }

        Map<String,String> emailList = new HashMap<>();
        emailList.put("Sudip", "sudiplun@gmail.com");
        emailList.put("kri", "kri123@gmail.com");
        System.out.println(emailList.get("kri"));
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Sudip"));
        System.out.println(emailList.containsValue("Sudip"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sudip", 24));
        students.add(new Student("kri", 12));
        for (Student s: students) {
            System.out.println(s.getName());

    }

}
}
