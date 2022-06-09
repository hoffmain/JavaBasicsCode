package com.syntax.class14;

public class MethodsDemo4 {
	
	public static void main(String[] args) {
		MethodsDemo4 md=new MethodsDemo4();
		
		System.out.println(md.sumNum(10, 10));
		
		md.prints("Java", 3);
		
		
	}

	int sumNum(int num1, int num2) {
		return num1+num2;
	}
	
	//Write a method that takes a String and and int and prints out that String
	//on the console that many times that value that we can in int
	
	void prints(String name, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(name);
		}
	}
	
}
