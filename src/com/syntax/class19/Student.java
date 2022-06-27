package com.syntax.class19;

public class Student {
    /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables. */

    String name;
    double grade1;
    double grade2;
    double grade3;

    Student(String name, double grade1, double grade2, double grade3){
        grade1=grade1;
        grade2=grade2;
        grade3=grade3;
        this.name=name; //we are using this with name because we have same name variable inside
        // the constructor as well
    }

    public void calculateAvgGrade(){
        double avgGrade=(grade1+grade2+grade3)/3;
        System.out.println(name+avgGrade);
    }
}
