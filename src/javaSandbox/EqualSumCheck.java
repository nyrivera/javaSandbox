 package javaSandbox;

public class EqualSumCheck {

	public static void main(String[] args) {
		
		int numOne = -2;
		int numTwo =2;
		int numThree = 2;
	System.out.println(hasEqualSum(numOne, numTwo, numThree));
	}
	public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
		int sum = numOne + numTwo;
		
		if (sum == numThree){
			return true;
		}
		return false;
		
		
	}

}
