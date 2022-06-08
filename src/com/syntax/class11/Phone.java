package com.syntax.class11;

public class Phone {
	
	String model;
	int year;
	String color;
	int batteryPrct;
	
	void turnOn() {
		System.out.println("Phone screen lights up");
	}void sendTexts() {
		System.out.println("Phone sends text message");
	}void charge() {
		System.out.println("Phone is recharging");
	}void turnOff() {
		System.out.println("Phone goes to sleep");
	}

	public static void main(String[] args) {
		
		Phone apple=new Phone();
		apple.model="iPhone 11 Pro";
		apple.year=2019;
		apple.color="Grey";
		apple.batteryPrct=84;
		System.out.println("The "+apple.model+" is "+apple.color+" in color");
		
		Phone samsung=new Phone();
		samsung.model="Galaxy S5";
		samsung.year=2017;
		samsung.color="Black";
		samsung.batteryPrct=98;
		samsung.turnOn();
		
		Phone pixel=new Phone();
		pixel.model="Pixel 6";
		pixel.year=2008;
		pixel.color="White";
		pixel.batteryPrct=61;
		pixel.charge();
		
	}
}
