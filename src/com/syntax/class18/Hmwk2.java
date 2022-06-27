package com.syntax.class18;

public class Hmwk2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverseStr(String str){
        StringBuilder rev=new StringBuilder(str);
        rev=rev.reverse();
        return rev.toString();
    }

    public static void main(String[] args) {
        Hmwk2 revStr=new Hmwk2();
        System.out.println(revStr.reverseStr("hello"));
    }

}
