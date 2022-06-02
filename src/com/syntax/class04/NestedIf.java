package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
 
		boolean vaccine=false;
		int dose=1;
		
		if(vaccine) {
			System.out.println("Let me check if you got a second dose");
			
			if(dose==1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		System.out.println(" ------------- ");
		
		String month="May";
		int day=19;
		
		if (month.equals("May"))  {
			System.out.println("Let me check what is today's date");
			
			if(day==8) {
				System.out.println("Today is Moomy's Day");
			}
		}else if (month.equals("June")) {
			System.out.println("Let me check today's date");
			
			if (day==19) {
				System.out.println("Today is Foother's Day");
			}
		}
		
		
	}

}
