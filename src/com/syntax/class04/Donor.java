package com.syntax.class04;

public class Donor {
	
	public static void main(String[] args) {
		
		boolean ofAge=true;
		int weight;
		
		if (ofAge) {
			System.out.println("You are eligible to donate blood");
			weight=109;
			
			if (weight>=110) {
				System.out.println("You are accepted to donate blood");
			}else if (weight<110) {
				System.out.println("You are not accepted to donate blood");
			}
		}else {
			System.out.println("You are not eligilbe to donate blood");
		}
		
	}

}
