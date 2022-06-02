package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		//print even numbers from 20 to 100
		
		int x=20;
		while (x<=100) {
			System.out.print(x+" ");
			x+=2;
		}
		
		//print only odd numbers from 100 to 1
		System.out.println();
		
		int z=99;
		while(z>=1) {
			System.out.print(z+" ");
			z-=2;
			
		}
			
		//Print only odd numbers from 100 to 1
		System.out.println();
		
		int r=100;
		
		while(r>=1) {
			if (r%2!=0) {
				System.out.println(r+" ");
			}
		}
		  r--;
		
		
		
		
	}

}
