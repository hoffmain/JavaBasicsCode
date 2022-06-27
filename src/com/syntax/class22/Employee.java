package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=300000;
    int baseHoliday=10;

    void calculatePrintSalary(){
        System.out.println(baseSalary);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHoliday);
    }
}

class OfficeBoy extends Employee{

}
class Manager extends Employee{


    @Override
    void calculatePrintSalary() {
        super.calculatePrintSalary();
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday*3);
    }
}

class Developer extends Employee{
    void calculatePrintSalary(){
        System.out.println(baseSalary*3+300000);
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday*2);
    }
}

class QA extends Employee{
    void calculatePrintSalary(){
        System.out.println(baseSalary*2+200000);
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday*2);
    }
}