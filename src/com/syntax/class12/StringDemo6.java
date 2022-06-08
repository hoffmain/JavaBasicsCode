package com.syntax.class12;

public class StringDemo6 {
	
	public static void main(String[] args) {
		
		String str="123456789894654347";
		
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='1') {
				counter++;
			}
		}
		System.out.println(counter);
		
	}

}
