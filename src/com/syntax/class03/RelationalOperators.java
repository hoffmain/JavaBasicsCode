package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		//<, >, <=, >=, ==, !=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);//false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true
		
		System.out.println(num1==num2);//no=false
		System.out.println(num1=num2);//22; '=' assignment operator
		
		System.out.println(num1==num2);//true; the value was reassigned
		
		boolean result=100>200;
		System.out.println(result);//false
		
		int result1=100+200;//300
		
		String result2="Emre"+10;//Emre10
		
		int num3=10;
		int num4=11;
		
		result=num3==num4;
		System.out.println(result);//false
		
		//Type mismatch: cannot convert from boolean to int
		result=num3!=num4;//check if num3 is Not equal to num4
		System.out.println(result);//true
		
		
	}

}
