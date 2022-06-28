package com.syntax.review03;

public class IfElse5 {
	public static void main(String[] args) {
		
		/*
		 * When multiple if else if conditions result in same output then we can 
		 * replace if else if condition with logical || operator
		 */
		
		String country="Turkey";
		
		if("Turkey".equals(country)) {
			System.out.println("Ankara");
		}else if("USA".equals(country)) {
			System.out.println("DC");
		}else if("Serbia".equals(country)) {
			System.out.println("Bengrade");
		}else if("Albania".equals(country)) {
			System.out.println("Tirana");
		}else if("Afghanistan".equals(country)) {
			System.out.println("Kabul");
		}else if("Pakistan".equals(country)) {
			System.out.println("Islamabad");
		}
	}

}
