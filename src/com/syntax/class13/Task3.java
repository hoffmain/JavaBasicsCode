package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two people's first
		 *names and if they expecting boy or girl? 
		 *Based on the input suggests a name for a baby:
		 */
		
		String father="Chris";
		String mother="Elexia";
		boolean boy=true; //true means girl, otherwise boy
		
		if(boy) {
			String firstHalf=father.substring(0, father.length()/2);
			String secondHalf=mother.substring(mother.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}else {
			String firstHalf=mother.substring(0, mother.length()/2);
			String secondHalf=father.substring(father.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim()); 
		}
		
	}
}
