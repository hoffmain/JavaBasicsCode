package com.syntax.class05;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You will receive a driver's license");
		}else {
			System.out.println("You can get a learner's permit");
		}
		
		
		
	}

}
