package com.syntax.class24.Notes;

public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
}

class Student{
    void doHomework(){
        System.out.println("Students should do homework");
    }
    void study(){
        System.out.println("Students must study");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void doHomework() {
        System.out.println("Syntax students must solve the replits to get a good job");
    }

    @Override
    void study() {
        System.out.println("Syntax students must learn programming");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must practice to get a good job");
    }
}
class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College students must practice to get good grades");
    }
}
class SchoolStudent extends Student{

}