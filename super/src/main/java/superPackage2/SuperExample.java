package superPackage2;

public class SuperExample extends SuperMethodInvoke{

	public void walk() {
		System.out.println("Walking..");
		
	}
	
	public void run() {
		System.out.println("This is run method 2");
	}
	
	public void sleep() {
		 
		walk();
		run();
		super.run();// to invoke method of immediate parent class
	}
}
