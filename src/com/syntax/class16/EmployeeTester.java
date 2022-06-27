package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Marve";
        //employee.salary=125000; we can't access because it is private
        //employee.department="IT"; because we can't access default variables of class inside a different package
        System.out.println(Employee.manager);
        //Static fields and methods can also be accessed by just writing the name of the class
    }
}
