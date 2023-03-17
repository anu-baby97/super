package superPackage;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	protected void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
