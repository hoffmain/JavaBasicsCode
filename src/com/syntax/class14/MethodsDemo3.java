package com.syntax.class14;

public class MethodsDemo3 {
	
	//write a method that takes an int value if that value is even this
	//returns true otherwise it returns false
	
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	//write a method that takes a String and returns true if number of characters in that String
	//are even otherwise odd
	
	boolean characters(String word) {
		if(word.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		
		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.characters("hello"));
		
	}
}
