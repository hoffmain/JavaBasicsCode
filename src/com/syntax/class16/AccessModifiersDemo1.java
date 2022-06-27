package com.syntax.class16;

public class AccessModifiersDemo1 {
    private String password="pass123";
    public int ssn=123456;
    String name="Ed";

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }
}
