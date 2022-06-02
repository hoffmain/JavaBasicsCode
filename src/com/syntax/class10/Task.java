package com.syntax.class10;

public class Task {
	
	public static void main(String[] args) {
		
		/*
		 * Form an array of integer elements find the largest number
		 */
		
		int[] array = {5, 28, 36, 1, 14, 56, 48, 17};
		int bigNum = array[0];
		
		for (int i=1; i<array.length; i++) {
			if (array[i]>bigNum) {
				bigNum=array[i];
			}
		}
		System.out.println("The largest element is "+bigNum);
		
		bigNum = array[0];
		
		for(int num:array) {
			if(num>bigNum) {
				bigNum=num;
			}
		}

		System.out.println("----------------");
		
		/*
		 * Create an array to store char values
		 * and then print those in reverse order
		 */
		
		
		char [] values= {'a', 'b', 'c', 'd'};
		for(int i=values.length-1; i>=0; i--) {
			System.out.print(values[i]+" ");
		}
		
		
	}

}
