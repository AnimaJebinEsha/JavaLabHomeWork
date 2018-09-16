package main;

public class NumericTestRun {
	public static void main(String args[]) {
		NumericTest isEven = (n) ->(n % 2) == 0;
		NumericTest isNegative = (n) -> (n < 0) == 0;
		System.out.println(isEven.computeTest(5));
		System.out.println(isNegative.computeTest(-5));
		
		MyGretting mg = (name) -> "Good Morning " + name + "!";
		System.out.println(mg.processName("Omar"));
		
		MyGretting morningGretting = (str) -> "Good Morning " + str + "!";
		MyGretting morningGretting = (str) -> "Good Evening " + str + "!";
		
		Ststem.out.println();
	}
		

}
