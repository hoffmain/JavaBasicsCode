package com.syntax.class02;

public class Values {

	public static void main(String[] args) {
		
		String name="Elexia";
		String lastName="Powers";
		char grade='B';
		String phoneNumber="123-456-7890";
		String city="Honolulu";
		String state="Hawaii";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in "+city+", "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Las Vegas";
		state="Nevada";
		phoneNumber="098-765-4321";
		grade='A';
		
		System.out.println("My name is "+name+" and I moved to "+city+" in "+state+".");
		System.out.println("My new phone number is "+phoneNumber+".");
		
		//change city, state, number, grade
		//My name is _ and I moved to new city _ and new state_.
		//My new phone number is _.

	}

}
