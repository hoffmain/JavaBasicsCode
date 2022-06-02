package com.syntax.class04;

public class LargerNumber {

	public static void main(String[] args) {
		
		int yo1=28, yo2=79, yo3=54;
		
		if (yo1>yo3 & yo2<yo1) {
			System.out.println(yo1+" is the largest number");
		}else if (yo3>yo1 & yo3>yo2) {
			System.out.println(yo3+" is the largest number");
		}else if (yo2>yo3 & yo3>yo1) {
			System.out.println(yo2+" is the largest number");
		}
	}
	
}
