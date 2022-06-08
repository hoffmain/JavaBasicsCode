package com.syntax.class13;

public class Recap2 {
	
	public static void main(String[] args) {
		
		String str="Where is zameer?";
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("e",6)); //starts the search from index 6 to find first "e"
		
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				System.out.print(i+" ");
				if(counter==3) {
					System.out.println(i);
				}
				
			}
		}
		
		
		
		
	}

}
