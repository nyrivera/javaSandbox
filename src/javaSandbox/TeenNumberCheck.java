package javaSandbox;

public class TeenNumberCheck {

	public static void main(String[] args) {
		int numOne =19;
		int numTwo = 11;
		int numThree = 1;
		int numFour = 12;
		
		hasTeen(numOne, numTwo, numThree);
		isTeen(numFour);
		System.out.println(hasTeen(numOne, numTwo, numThree));
		System.out.println(isTeen(numFour));
	}
	public static boolean hasTeen(int numOne, int numTwo, int numThree) {
		if((numOne >=13 && numOne <=19 ) || ( numTwo >=13 && numTwo <=19 ) || ( numThree >=13 && numThree <=19 )) {
			return true;
		}
			return false;
		}
	public static boolean isTeen(int numFour) {
		if(numFour >=13 && numFour <=19 ){
			return true;
			
		}
		return false;
		
	}
	} 


