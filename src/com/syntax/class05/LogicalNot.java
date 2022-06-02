package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean boo=true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if there is no traffic --> I will get to work on time
		 */
		
		boolean traffic=true;
		
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Hoffman";
		
		if (!name.equals("Elexia")) {
			System.out.println("You are not Elexia, and I need Elexia");
		}
		
	}

}
