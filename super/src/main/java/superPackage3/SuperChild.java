package superPackage3;

public class SuperChild extends SuperInvokeObjRef{

	String color="black";
	
	public void print() {
		
		System.out.println(color);
		System.out.println(super.color); //to refer object/variable of immediate parent class
	}
	
	public static void main(String args[]) {
		SuperChild s=new SuperChild();
		s.print();		
		
	}
}

