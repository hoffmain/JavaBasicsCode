package com.syntax.class28;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("kiwi");
        fruit.add("orange");
        System.out.println(fruit); //[mango, apple, kiwi, orange, banana]
        //insertion order is maintained
        //duplicates are ignored
    }
}
