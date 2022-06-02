package com.syntax.class10;

public class MoreExamples {
	
	public static void main(String[] args) {
		
		int[][] nums= { 
				{1, 2, 3, 4, 5}, 
				{199, 300, 588, 700}, 
				{1900, 4578, 98787} };
		
		
		System.out.println("All values using enhanced for loop");
		
		/*
		 * enhanced for loop uses variables to access elements from an array
		 * 
		 * outer for loops -> iterates over 1D array
		 * inner loop --> iterates over elements of each 1D array
		 */
		
		for(int[] num:nums) {//num holds the first array
			
			for(int n:num) {//n holds all the elements in the first array
				
				System.out.print(n+" ");//1, 2, 3, 4, 5
		
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		/* i loops iterates over rows
		 * nums.length gives # of array inside 2D array =3
		 * j loop iterates over columns
		 */
		
		for(int i=0; i<nums.length; i++) {
			
			for(int j=0; j<nums[i].length; j++) {
				
				System.out.print(nums[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------");
		
		System.out.println("Retrieve all values using for each loop");
		

		String[][] usa= { 
				{"New York", "Albany", "Buffalo"},
				
				{"Los Angeles", "San Fransico", "San Jose", "San Diego", "Redding"},
				
				{"Miami", "Orlando", "Niceville", "Tampa"},
				
				{"McLean", "Richmond", "Leesburg"}
		};
		
		for(String[] states:usa) {
			for(String city:states) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
		
	}

}
