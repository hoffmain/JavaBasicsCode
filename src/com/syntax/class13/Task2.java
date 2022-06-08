package com.syntax.class13;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String str="Sunday";
		for(int i=str.length()-1; i>=0; i--) { 
			//length is the number of indexes, they start from 0 so we have to reduce 1
			System.out.println(str.charAt(i));
		}
		
	}

}
