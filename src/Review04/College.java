package Review04;

public class College {
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.name="John";
		stu.lastName="Doe";
		stu.address="New York";
		stu.studentId=199;
		stu.age=45;
		stu.grade='B';
		
		stu.study();
		stu.doHomework();
		System.out.println(stu.getFullName());
		stu.printInfo();
		String rating1=stu.rating();
		
		System.out.println(stu.name+" is "+rating1+" student");
		
		
		
		
	}

}
