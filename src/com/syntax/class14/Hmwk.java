package com.syntax.class14;

public class Hmwk {
	
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	int larger(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	//Create a method that will take a number and prints whether the number is even or odd.
	
	void number(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
	
	//Create a method that will print whether given String is palindrome or not.
	
	void same(String str) {
		String backward="";
		for(int i=str.length()-1; i>=0; i--) {
			backward+=str.charAt(i);
		}
		if(backward.equalsIgnoreCase(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
	}
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed
	
	void language(String country) {
		
		String hello;
		switch(country.toLowerCase()) {
			case "usa":
				hello="hello";
			case "japan":
				hello="konnichiwa";
			case "mexico":
				hello="hola";
			default:
				System.out.println("I don't know that language");
		}
	}
	
	//Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	
	String createEmail(String userName, String lastName, String email) {
		System.out.println(userName.toLowerCase()+lastName.toLowerCase()+"@"+email+".com");
	}
	
	//Write a method to return whether given number is prime or not?
	
	boolean primeNum(int num) {
		boolean prime=true;
		boolean notPrime=false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return notPrime;
			}else {
				return prime;
			}
		}
	}
	
	//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	//score > 90 - A
	//score >80 - B
	//score >70 - C
	//score > 50 - D
	//anything else - F
	
	char getGrade(int grade) {
		if(grade>=90) {
			return 'A';
		}else if(grade<90 && grade>=80) {
			return 'B';
		}else if(grade<80 && grade>=70) {
			return 'C';
		}else if(grade<70 && grade>=50) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	public static void main(String[] args) {
		
		Hmwk large=new Hmwk();
		large.larger(4,9);
				
		Hmwk evenOdd=new Hmwk();
		evenOdd.number(7);
		
		Hmwk palindrome=new Hmwk();
		palindrome.same("cat");
		
		Hmwk language=new Hmwk();
		language.language("Japan");
		
		Hmwk email=new Hmwk();
		email.createEmail("First", "Last", "yahoo");
		
		Hmwk prime=new Hmwk();
		System.out.println(prime.primeNum(0));
		
		Hmwk grade=new Hmwk();
		System.out.println(grade.getGrade(87));
	}
	
}
