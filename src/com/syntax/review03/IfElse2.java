package com.syntax.review03;

public class IfElse2 {
	public static void main(String[] args) {
		
		/*
		 * When code executes but does not produce expected results we call these mistakes logical
		 * errors
		 * When code does not even execute we call these mistakes syntax errors
		 */
		
		String day="Monday"; //in non-primitive type variables we can store null which means nothing
		
		if(day.equals("Monday") || "Tuesday".equals(day) || "Wednesday".equals(day)
				|| "Thursday".equals(day) || "Friday".equals(day)){
			System.out.println("weekday");
		}else if("Satuday".equals(day) || "Sunday".equals(day)){
			System.out.println("weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
