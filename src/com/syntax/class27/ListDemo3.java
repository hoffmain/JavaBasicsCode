package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>(); //recommended
        legends.add("Hamid"); //0
        legends.add("Karla"); //1
        legends.add("Naveed"); //2
        legends.add("Tara"); //3
        legends.add("Yusuf"); //4
        legends.add("Yusuf"); //5
        legends.add("Herbert"); //6
        legends.add("Yusuf"); //7
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0, "Hamid Jan"); //replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf")); //returns position of first occurrence
        System.out.println(legends.lastIndexOf("Yusuf"));

        System.out.println(legends.subList(0,3)); //the last index subtracted from the first index
        //the first index is inclusive/included, the last index is exclusive/excluded
    }
}
