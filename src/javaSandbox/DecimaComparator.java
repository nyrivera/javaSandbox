package javaSandbox;

public class DecimaComparator {

	public static void main(String[] args) {
		double numOne = 0;
		double numTwo = 0;
		areEqualbyThreeDecimalPlaces(numOne, numTwo);

	}
	public static boolean areEqualbyThreeDecimalPlaces(double numOne, double numTwo) {
		
		float numOneFloat = (float)numOne;
		System.out.println(numOneFloat);
		System.out.printf("%.3f", numTwo);
		return true;
		
	}

}
