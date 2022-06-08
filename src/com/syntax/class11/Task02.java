package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int arraySize=input.nextInt();
		String[] countryArray=new String[arraySize]; //creating an array of size that will be entered by user
		
		for(int i=0; i<countryArray.length; i++) {
			countryArray[i]=input.nextLine();// taking the input form the user and storing it inside the array
		}
		
		for(String element:countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			}else if(element.equalsIgnoreCase("turkey")) {
				System.out.println("Anakara");
			}else if(element.equalsIgnoreCase("thailand")) {
				System.out.println("Bangkok");
			}else {
				System.out.println("Country no supported by My Great Java program version 1.0");
			}
		}
		
	}

}
