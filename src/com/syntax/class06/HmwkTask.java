package com.syntax.class06;

import java.util.Scanner;

public class HmwkTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your country");
		
		String country, language;
		
		country=input.next();
		
		switch(country) {
		
		case "USA":
			language="English";
			break;
		case "Japan":
			language="Japanese";
			break;
		case "Korea":
			language="Korean";
			break;
		case "Thailand":
			language="Thai";
			break;
		case "Laos":
			language="Lao";
			break;
		default:
			language="I don't know what you speak";
		}
		System.out.println("If you are from "+country+" you probably speak "+language);
		
		
		
		if (country.equals("USA")) {
			System.out.println("If you are from "+country+" you probably speak "+language);
		}else if (country.equals("Japan")) {
			System.out.println("If you are from "+country+" you probably speak "+language);
		}else if (country.equals("Korea")) {
			System.out.println("If you are from "+country+" you probably speak "+language);
		}else if (country.equals("Thailand")) {
			System.out.println("If you are from "+country+" you probably speak "+language);
		}else if (country.equals("Laos")) {
			System.out.println("If you are from "+country+" you probably speak "+language);
		}else {
			System.out.println("I don't know what you speak");
		}
		

		

		
		
	}

}
