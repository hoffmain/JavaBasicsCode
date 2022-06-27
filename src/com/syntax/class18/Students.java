package com.syntax.class18;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student name.
    NOTE: please use different names for instance and local variables.
     */

    String name;
    int math;
    int english;
    int science;

    void Students(String name, int math, int english, int science){
        math=math;
        english=english;
        science=science;
        int average=((math+english+science)/3);
        System.out.println(name+" has an average grade of "+average);
    }

    public static void main(String[] args) {
        Students s1=new Students();
        s1.Students("John", 65, 75, 70);
        Students s2=new Students();
        s2.Students("Jacob", 87, 97, 64);
        Students s3=new Students();
        s3.Students("Jingle",75, 66, 78);
        Students s4=new Students();
        s4.Students("Heimer", 99, 87, 95);
        Students s5=new Students();
        s5.Students("Smith", 57, 98, 89);
    }

}
