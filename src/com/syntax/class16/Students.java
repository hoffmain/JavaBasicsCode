package com.syntax.class16;

public class Students {

    //Create a Class called Students
    //Create three  variables  Name, ID and numberOfStudents
    //Create three objects of the Students Class
    //Set the value for studentName, studentID and increment the numberOfStudents for each object
    //Print out total number of students

    String name;
    int ID;
    static int numberOfStudents;
    void noOfStudents() {
        System.out.println("The total number of students is "+numberOfStudents);
    }

    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Elexia";
        s1.ID=103;
        s1.numberOfStudents=1;

        Students s2=new Students();
        s2.name="Chris";
        s2.ID=111;
        s2.numberOfStudents=2;

        Students s3=new Students();
        s3.name="Kat";
        s3.ID=144;
        s3.numberOfStudents=3;

        s3.noOfStudents();

    }
}
