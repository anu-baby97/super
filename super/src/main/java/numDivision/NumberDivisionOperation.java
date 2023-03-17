package numDivision;

public class NumberDivisionOperation {

	private int a, b;

	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
		sumDivisionOperation();
	}
	
	public int sumDivisionOperation() {
		int sum = a+b;
		int rem = sum%10;
		return rem;
	}

}
