package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height");
		int inch=input.nextInt();
		
		if (inch<60) {
			System.out.println("You are short");
		}else if (inch>=60 && inch<=72) {
			System.out.println("You are medium");
		}else if (inch>72) {
			System.out.println("You are tall");
		}
		
		
		
	}

}
