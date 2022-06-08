package com.syntax.class11;

public class DogInClass {
		
		//attributes how the object will look like
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		
		//how that object behave
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Dogs like to eat bone");
		}
		
	public static void main(String[] args) {
		
		//Scanner input=new Scanner(system.in); //
		//input.next();
		
		DogInClass kiwi=new DogInClass(); //new Dog() how we create an object and storing a variable
		kiwi.name="Kiwi";
		kiwi.age=3;
		kiwi.weight=53;
		kiwi.color="Black";
		kiwi.height=2.6;
		kiwi.breed="Australian";
		kiwi.bark();
		
		
		}

}
