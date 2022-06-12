package com.syntax.class15;

public class MethodsDemo1 {

    void method1() {
        System.out.println("I can use print statements in a void type method");
        int num=0;
        //return; because void means that no data will be returned from this method
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1=new MethodsDemo1();
        //int x=methodsDemo1.method1(); methods with coid return type can't be assigned to variables
    }



}
