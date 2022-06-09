package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
	
	/*
	 * What is a Method:
	 * Method is a block of code, a group of Java statements
	 * that are grouped together and we can execute those statements
	 * by just creating an object of the class that contains 
	 * How: that method and by writing the objects name .method name 
	 */
	
	void printHello() {
		System.out.println("How are you guys");
	}
	
	boolean returnTrue() {// data type(boolean) & name of method(returnTrue)
		return true; //written value
	}
	
	int returnInt() {
		return 10;
	}
	
	//Methods that return something and Methods that don't return something
	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo();//create object of the class & name
		md.printHello();
		
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		
	}

}
