package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Apple",10.5); //value will override 1st "Apple"
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi")); //get the value of specific fruit
        System.out.println(fruit.remove("Orange")); //removes the key
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(10.2));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi",15.2);
        System.out.println(fruit);
        //fruit.put(null,null);
        System.out.println(fruit);
    }
}
