package com.syntax.class14;

public class Recap {
	
	public static void main(String[] args) {
		
		String str="I never forget about recording";
		System.out.println(str.replace("never", "always").replace("I", "Ashgar"));
		
		str="kanjkadf12232ASADNKSJ!@#$";
		System.out.println(str.replaceAll("[0-9]", ""));
		
		String str2="Batch 13 is Great. Batch 13 is Best. Batch 13 is excellent";
		String[] arr=str2.split("[ ]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		str="WE #love# Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);

		
	}

}
