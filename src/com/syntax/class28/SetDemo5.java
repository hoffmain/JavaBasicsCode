package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo5 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");
        System.out.println(fruit);

        Iterator<String> iterator=fruit.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String frt:fruit){
            System.out.println(frt);
        }

    }
}
