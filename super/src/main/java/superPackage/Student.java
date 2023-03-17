package superPackage;

public class Student extends Person {
	
	private String courseName;
	
	public Student(String name, int age, String courseName) {
	
		super(name,age); //calling immediate parent class constructor
	
		this.courseName=courseName;
	}
		
	public void print() {
		display();
		System.out.println(courseName);
	}
}

