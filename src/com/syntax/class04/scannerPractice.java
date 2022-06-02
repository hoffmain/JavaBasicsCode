package com.syntax.class04;

import java.util.Scanner;

public class scannerPractice {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=input.next();
		
		System.out.println(name + " please enter your age");
		
		int age=input.nextInt();
		
		System.out.println(name +" is "+age+" years old");
		
	}

}
