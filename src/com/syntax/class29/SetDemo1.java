package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        //when we pass the list to the constructor of the Set, java will create a set out of that list
        //and using the same approach we get a list back from set
        numbers=new ArrayList<>(new LinkedHashSet<>(numbers));
        /*LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(); //Creating a set
        linkedHashSet.addAll(numbers); //adding all the elements from the list to the set
        numbers=new ArrayList<>(); //create a new array
        numbers.addAll(linkedHashSet); //adding the unique elements*/

        System.out.println(numbers);
    }
}
