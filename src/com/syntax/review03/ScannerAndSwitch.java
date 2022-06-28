package com.syntax.review03;

import java.util.Scanner;

public class ScannerAndSwitch {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the country");
		String country=input.nextLine();
		String capital=null;
		
		switch(country) {
		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Begrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case "Afghanistan":
			capital="Kabul";
			break;
		case "Pakistan":
			capital="Islamabad";
			break;
		default:
			System.out.println("Either country name included is not correct or it's not a country");
		}
		System.out.println(capital);
		input.close();
	}

}
