package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Peach",10.5);
        Set<String> keys=fruit.keySet(); //all teh keys form a map in the form of Set
        for(String key:keys){
            System.out.println("key = "+key);
        }

        //we cannot store a collection inside an ArrayList, but we can do the reverse
        //ArrayList<Double> values= (ArrayList<Double>) fruit.values();

        //var values: Collection<Double> values=fruit.values(); java 8

        //All the values in the form of a collection
        Collection<Double> values=fruit.values();
        for(Double value:values){
            System.out.println("value = "+value);
        }
    }
}
