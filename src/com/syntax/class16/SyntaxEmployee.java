package com.syntax.class16;

public class SyntaxEmployee {

    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    int empID;
    double salary;
    static String CEO="Sumair";

    void displayEmpInfo() {
        System.out.println("Employee ID number "+empID+" Salary "+salary+" CEO "+CEO);
    }

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=33;
        emp1.salary=117000;
        emp1.CEO="Sumair";

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=57;
        emp2.salary=250000;
        emp2.CEO="Sumair";

        emp2.displayEmpInfo();
    }

}
