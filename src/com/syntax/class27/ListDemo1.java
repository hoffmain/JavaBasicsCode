package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //we can store the object of a class inside a variable of type parent class or interface
        //if that class implements that interface
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        System.out.println(legends.size());// will return amount of String in array
        System.out.println(legends.isEmpty());// will return false
        System.out.println(legends.contains("Bahram"));// will return false
        System.out.println(legends.contains("hamid"));// will return true
        Object[] arr= legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> someStudents=new ArrayList<>();
        someStudents.add("Abdul");
        someStudents.add("Hamid");
        System.out.println(legends.containsAll(someStudents));
    }
}
