package com.syntax.class09;

public class ClassTask {
	
	public static void main(String[] args) {
		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade[1]);
		
		System.out.println("-------------");

		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	}

}
