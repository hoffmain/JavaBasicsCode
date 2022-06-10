package Review04;

public class School {
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		
		student1.name="Elexia";
		student1.lastName="Hoffman";
		student1.address="Florida";
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		
		/*
		 * subject cannot be resolved or identified
		 * student1.subject="Java;
		 */
		
		Student student2=new Student();
		
		student2.name="Omid";
		student2.lastName="Mahammed";
		student2.address="California";
		student2.age=13;
		student2.studentId=102;
		student2.grade='B';
		//accessing methods of Student class
		student2.study();
		student2.doHomework();
		
		System.out.println("---------");
		
		student1.study();
		student1.doHomework();
		
		String fullName=student1.getFullName();
		System.out.println(fullName);
		
		fullName=student2.getFullName();
		System.out.println(fullName);
		
		student1.printInfo();
		student2.printInfo();
		
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
		
		
		
	}

}
