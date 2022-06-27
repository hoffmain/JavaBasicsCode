package com.syntax.class16;

public class InstanceDemo {

    String str="instance";

    void changesInstanceValue() {
        str="Captain";
    }

    void printInstanceValue() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id=new InstanceDemo();
        System.out.println(id.str); //prints the value of str
        id.printInstanceValue(); //method once simply prints the value of str which will be not Captain
        id.changesInstanceValue(); //this method changes the instance variable value which is now Captain
        id.printInstanceValue(); //
    }
    //System.out.println(id.str); //instance
    //id.method(); //prints instance
    //id.method1(); //changes str to method1
    //id.method(); //now str equals method1 so method prints method1
}
