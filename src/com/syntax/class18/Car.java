package com.syntax.class18;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car(){

    }

    public Car(String carModel){
        model=carModel;
    }

    /* public Car(String ssdf){
        model=carMake;
        it is not allowed to have two constructors in a class with same number of parameters and same type
        will confuse Java
    }*/

    void printCarModel(){
        System.out.println("Model "+model);
    }

    public Car(String carMake,String carModel,String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }

    void printInfo(){
        System.out.println("CarMake "+make+" Model "+model+" Color "+color);
    }

}
