package com.syntax.class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {

        ArrayList<Flower> flower=new ArrayList<>();
        flower.add(new Rose());
        flower.add(new Lily());
        flower.add(new Flower());

        for(Flower flower1:flower){
            flower1.bloom();
        }

    }
}

class Flower{
    void bloom(){
        System.out.println("Generally flower in spring");
    }
}
class Rose extends Flower{
    void bloom(){
        System.out.println("Bloom in April");
    }
}
class Lily extends Flower{
    void bloom(){
        System.out.println("Bloom in Summer");
    }
}