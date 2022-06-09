package com.syntax.class14;

public class Task4 {
	
	public static void main(String[] args) {
		
		/*
		 * How would you reverse a String word by word? for example
		 *  input=>This is sentence i want to reverse
		 *  output=>sihT si ecnetnes i tnaw ot esrever
		 */
		
		String str="This is sentence i want to reverse";
		String[] arr=str.split(" ");
		
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		//new StringBuilder9s0 object of StringBuilder is created
		
		System.out.println();
		//System.out.println(new StringBuilder(str).reverse());
		
	}

}
