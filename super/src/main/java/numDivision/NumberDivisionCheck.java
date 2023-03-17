package numDivision;

public class NumberDivisionCheck extends NumberDivisionOperation {

	public void printResult() {
		int result = super.sumDivisionOperation();
		
		if (result == 0) {
			System.out.println("Sum of numbers is divisible by 10");
		} else {
			System.out.println("Sum of numbers is not divisible by 10");
		}
	}
	public static void main(String[] args) {
		NumberDivisionCheck n=new NumberDivisionCheck();
		n.setNum(6, 14);
		n.printResult();
	}

}
