package com.syntax.class18;

public class Hmwk8 {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;


    public Hmwk8(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void studentInfo(){
        System.out.println("Student "+name+" Address "+address);
    }

    public static void main(String[] args) {
        Hmwk8 student=new Hmwk8("David", "Ontario");
        student.studentInfo();
    }
}
