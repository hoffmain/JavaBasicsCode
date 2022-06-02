package com.syntax.class08;

public class NestedLoopIntro {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) { //outer loop
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) { //nested loop
				System.out.println("Bye");
			}
		}
		
		System.out.println("-----------------");
		
		for(int i=1; i<=3; i++) { //outer loop
			for (int y=1; y<=2; y++) { //nested loop
				System.out.println(i+" "+y);
			}
		}
		
		System.out.println("-----------------");
		
		for(int i=1; i<=3; i++) { //true- print 3 hellos
			System.out.println("Hello");
			for (int y=1; y>=2; y++) { //false- never print
				System.out.println("Bye");
			}
		}
		
	}

}
