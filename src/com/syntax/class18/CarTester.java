package com.syntax.class18;

public class CarTester {

    public static void main(String[] args) {
        Car car1=new Car("Audi", "Etron GT", "Black");
        //You need parameters when you use a constructor, you need the same amount of values in ()
        car1.printInfo();
        Car car2=new Car("Toyota", "Camry", "Blue");
        car2.printInfo();

        Car car=new Car("Tesla");
        car.printCarModel();

    }
}
