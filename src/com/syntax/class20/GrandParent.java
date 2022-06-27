package com.syntax.class20;

public class GrandParent {
    String name="Joseph";
}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("My father's name is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("My grandfather's name is "+name);
    }
}
class GrandChild extends Child{
    void printInfo(){
        System.out.println("My great grandfather's name is "+name);
    }
}

