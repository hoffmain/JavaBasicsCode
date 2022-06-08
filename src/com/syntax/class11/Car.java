package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int HP;
	
	void MoveForward() {
		System.out.println("Car is moving forward");
	}
	void Reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[] args) {
		
		Car bmw=new Car();
		
		bmw.model="X6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		
		System.out.println(bmw.model);
		bmw.MoveForward();
		bmw.Reverse();
		
		
	}

}
