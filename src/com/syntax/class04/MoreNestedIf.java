package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
		
		/*we need to check if replit was completed
		 * 
		 * if replit is completed we want to see
		 * 		if you did 15 and more --> great job
		 * 		if you did more than 10 --> did good
		 * 		if less than 10 --> try to complete all assignments
		 */
		
		
		boolean didReplit=true;
		int assignments;
		
		
		if (didReplit) {
			
			System.out.println("How many assignments have you done?");
			assignments=14;
			
			if (assignments>15) {
				System.out.println("You did a great job");
			}else if (assignments>10) {
				System.out.println("You did a good job");
			}else {
				System.out.println("Please complete all replit assignments");
			}
			
		}else {
			
			System.out.println("You should complete your Replit HW");
		}
	}

}
