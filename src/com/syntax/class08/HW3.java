package com.syntax.class08;

public class HW3 {
	
	public static void main(String[] args) {
		
		/*
		 * Using nested loop, create a 24 hour clock that will display 
		 * 2 digits for an hour and 2 digits for a minute.
		 */
		
		for(int h=0; h<=2; h++) {
			for(int r=0; r<=3; r++) {
				for(int m=0; m<=5; m++) {
					for(int n=0; n<=9; n++) {
					System.out.println(h+" "+r+" : "+m+" "+n);
					}
				}
			}
		}
		
	}

}
