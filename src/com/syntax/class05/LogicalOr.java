package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {

		/* Monday & Friday --> No class
		 * Tuesday & Wednesday --> Manual testing
		 * Thursday --> Review
		 * Saturday & Sunday --Java
		 */
		
		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
			
		}else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manual Testing class");
			
		}else if(day.equals("Thursday")) {
			System.out.println("I have Review class");
			
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
			
		}
		
	}

}
