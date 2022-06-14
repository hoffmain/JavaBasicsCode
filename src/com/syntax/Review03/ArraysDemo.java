package Review03;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//should create an array
		String name="Oleg";
		String name2="King";
		String name3="Mumtaz";
		
		//should not create an array
		String city="New York";
		String country="USA";
		String coninent="America";
		
		String[] names= {"Oleg", "King", "Mumtaz"};
		
		//95% of the times you will use this approach
		String[] names2=new String[3]; //creates an empty array
		names2[0]="Oleg"; //stores oleg on first position
		names2[1]="King";
		names2[2]="Mumtaz";

	}

}
