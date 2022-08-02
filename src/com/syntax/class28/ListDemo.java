package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object[] arr={"Hamid", 10.2, "Name"}; //bad programming

        for(Object obj:arr){
            //instanceof checks if a variable contains a specific type of object
            if(obj instanceof String) //keyword that checks the String in the array, stored in element
            System.out.println(((String)obj).length());
        }
    }
}
