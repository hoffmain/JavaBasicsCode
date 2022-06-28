package com.syntax.review03;

public class IfElse4 {
	public static void main(String[] args) {
		
		
		//if we have to test multiple conditions we go with if else if conditions
		String day="Monday";
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}else if("Tuesday".equals(day)){
			System.out.println("weekday");
		}else if("Wednesday".equals(day)){
			System.out.println("weekday");
		}else if("Thursday".equals(day)){
			System.out.println("weekday");
		}else if("Friday".equals(day)){
			System.out.println("weekday");
		}else if("Saturday".equals(day)){
			System.out.println("weekend");
		}else if("Sunday".equals(day)){
			System.out.println("weekend");
		}
				
	}

}
