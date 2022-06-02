package com.syntax.class06;

import java.util.Scanner;

public class HmwkTask3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("Enter operator");
		char operator=scan.next().charAt(0);
		int result=0;
		
		switch(operator) {
		
		case '+':
			result=(num1+num2);
			break;
		case '-':
			result=(num1-num2);
			break;
		case '*':
			result=(num1*num2);
			break;
		case '/':
			result=(num1/num2);
			break;
		default:
			System.out.println("Invalid");
		}
		System.out.println(result);
		
		
		if (operator=='+') {
			System.out.println(num1+num2);
		}else if (operator=='-') {
			System.out.println(num1-num2);
		}else if (operator=='*') {
			System.out.println(num1*num2);
		}else if (operator=='/') {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid");
		}
		
		
	}

}
