package com.syntax.class04;

import java.util.Scanner;

public class scannerHW {
	
	public static void main(String[] args) {
		
		
		//Part 1
		Scanner name=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String first=name.next();
		
		System.out.println("Please enter your last name");
		String last=name.next();
		
		System.out.println(first +" "+ last +" please enter state you live in");
		String state=name.next();
		
		System.out.println(first +" "+ last +" lives in "+ state);
		
		
		System.out.println("---------------------");
		//Part 2
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("Please print a number");
		int x=num.nextInt();
		
		System.out.println("Please print another numnber");
		int y=num.nextInt();
		
		if (x>y) {
			System.out.println(x+" is larger than "+y);
		}else {
			System.out.println(y+" is larger than "+x);
		}
	}

}
