package com.syntax.class13;

public class Recap {
	
	public static void main(String[] args) {
		
		String str="Batch 13 is great but I say this to every batch. I was kidding";
		int len=str.length();
		
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();
		System.out.println(str);
		str=" ";
		System.out.println(str.isEmpty());
		
		String str2="  Tara         ";
		System.out.println(str2.trim());
		str="Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println(str.contains("b"));
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("ing"));
		
		
	}

}
