package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		
		//while loop first checks condition
		//and only then executes block of code
		int num=1;
		while(num<=5) {
			System.out.print(num+" ");
			num++;
		}

		System.out.println("----------------");
		
		// do while first executes the code
		// and only then checks the condition
		int num1=10;
		do {
			System.out.print(num1+" ");
			num1++;
		}while (num1<=3);
		
		//print numbers 1 to 30 using do while
		
		int c=1;
		
		do {
			System.out.print(c);
			c++;
		}while(c<=30);
		
		System.out.println("---------------");
		
		//print even numbers from 70 to 30
		
		int num2=70;
		
		do {
			System.out.print(num2+" ");
			num2-=2;//68, 66, 64,...
		}while(num2>28);
		
	}

}
