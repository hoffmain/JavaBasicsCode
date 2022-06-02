package com.syntax.class05;

public class HW {

	public static void main(String[] args) {
		
		int age = 17;
		int weight = 110;
		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println(
						"You are " + age + " years old, and your weight is " + weight + " lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor.");
			}
		} else {
			System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
			System.out.println("You are not eligible to be a donor. You are younger than 18 years old.");
		}
		
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if (num1>= num2) {
			if (num1>=num3) {
				System.out.println(num1+" is largest number");
			}else {
				System.out.println(num3+" is largest number");
			}
		}else {//otherwise num2>num1
			if (num2>=num3) {
				System.out.println(num2+" is largest number");
			}else {//num3>num2
				System.out.println(num3+" is the largest number");
			}
		}
		
	}
		
	}


