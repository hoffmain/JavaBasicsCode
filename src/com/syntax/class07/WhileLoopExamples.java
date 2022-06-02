package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {

		//print numbers from 1 to 10;
		
		
		int num=1;
		
		while(num<=10) {	
			System.out.print(num+" ");
			num++;
		}// 1 2 3 4 5 6 7 8 9 10
		
		
		//print numbers from 1 to 10
		
		int num1=1;
		
		while (num1<=10) {
			num1++;
			System.out.print(num1+" ");
		}// 2 3 4 5 6 7 8 9 10 11
		
		//print from 10 to 100;
		System.out.println();
		
		int a=10;
		
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		//print numbers from 10 + 1;
		System.out.println();
		
		int b=1;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
		//print numbers from 100 to 50
		System.out.println();
		
		int x=100;
		while(x>=50) {
			System.out.print(x+" ");
			x--;
		}
		
		//print numbers from -1 to -10
		System.out.println();
		
		int y=-1;
		while(y>=-10) {
			System.out.print(y+" ");
			y--;
		}
		
		//print numbers from 1 to 20 but only even numbers
		System.out.println();
		
		int z=0;
		while(z<=20) {
			System.out.print(z+" ");
			z+=2; //z=z+2
		}
		
		//second way
		System.out.println();
		
		int f=1;
		while(f<=20) {
			if(f%2==0) {
			System.out.print(f+" ");
			}
			f++;
		}
		
		
		
		
	}

}
