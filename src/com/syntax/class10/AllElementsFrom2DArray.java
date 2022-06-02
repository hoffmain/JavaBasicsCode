package com.syntax.class10;

public class AllElementsFrom2DArray {
	
	public static void main(String[] args) {

		String[][] usa= { 
				{"New York", "Albany", "Buffalo"},
				
				{"Los Angeles", "San Fransico", "San Jose", "San Diego", "Redding"},
				
				{"Miami", "Orlando", "Niceville", "Tampa"},
				
				{"McLean", "Richmond", "Leesburg"}
		};
		
		//outer loop iterates over rows
		//inner loops iterates over columns
		
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col<usa[row].length; col++) {
				System.out.println(usa[row][col]);
			}
		}
		
		
	}

}
