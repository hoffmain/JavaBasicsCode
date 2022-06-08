package com.syntax.class12;

public class Phone {
	
	String model;
	String make;
	double screenSize;
	int RAM;
	int ROM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("calling someone");
	}
	void takePictures() {
		System.out.println("use my camera app to take pictures");
	}
	
	public static void main(String[] args) {
		
		Phone s22ultra=new Phone();
		s22ultra.make="Samsung";
		s22ultra.model="Samsung galaxy s22 ultra";
		s22ultra.screenSize=6.8;
		s22ultra.RAM=12;
		s22ultra.camera=108;
		s22ultra.storage=512;
		System.out.println(s22ultra.storage);
		s22ultra.call();
	}
	
	

}
