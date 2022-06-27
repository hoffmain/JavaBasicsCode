package com.syntax.class18;

public class Hmwk3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    public static String vowelsOnly(String str){
        return str.replaceAll("[^AEIOUaeiou]","");
    }

    public static void main(String[] args) {
        String word="Alaska";
        System.out.println(vowelsOnly(word));
    }

}
