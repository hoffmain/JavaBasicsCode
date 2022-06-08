package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		//Using Scanner create an array of integer values. After the array is created,
		//calculate the sum of all stored elements in that array.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=input.nextInt();
		
		System.out.println("the size of the arrays is "+arraySize);
		int[] integerArray=new int[arraySize];
		//we can't use enhanced for loop for inserting or updating the values of an array
		System.out.println("Please enter "+arraySize+" elements");
		for(int i=0; i<integerArray.length; i++) {
			integerArray[i]=input.nextInt();
		}
		
		System.out.println(Arrays.toString(integerArray));
		
		int sum=0;
		for(int element:integerArray) {
			sum=sum+element;
		}
		
		System.out.println("The sum of all the elements is "+sum);
		
		input.close();
	}

}
