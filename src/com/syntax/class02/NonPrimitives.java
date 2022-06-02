package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {

		String name="Elexia";
		String lastName="Hoffman";
		
		long phone=1234567890;
		
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		String address="123 School St";
		
		int age=30;
		String city="Miami";
		
		//shortcut for printting
		//type 'syso' +crtl +space --> hit enter
		
		/* we can use +  -> work as concatenation operator
		 * 				to attach String to String
		 * 				to attach String to int
		 * 				to attach String to double
		 * 				to attach other type
		 */
		System.out.println(name+" "+lastName);//Elexia Hoffman
		
		//Elexia lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Elexia is 30 years old
		System.out.println(name+" is "+age+" years old");
		
		/*
		 * Rules for identifiers
		 * 1. no spaces
		 * 2. no keywords
		 * 3. cannot start with numbers (but numbers can be used after the alpha character)
		 * 4. cannot start with special characters (except _, $)
		 */
		
		//String break="Hello"; error
		//int 1number=10; error
		//int num%=20; error
		
		int number1=10;
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Naming Conventions:
		 * follow camelCasing
		 * variable/methods names should start with lowercase and then follow camelCasing
		 * class names should start with uppercase
		 */
		
		String myCity="Tysons";
		
		
		
	}

}
