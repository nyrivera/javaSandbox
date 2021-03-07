package javaSandbox;

public class SumOddRange {

	public static void main(String[] args) {
		System.out.println( itIsOdd(6));
		System.out.println(sumOdd(1, 10));
	}

	public static boolean itIsOdd(int number) {
		
		if (number < 0 && number%2 != 0)
			return false;
			return true;
	}

	public static int sumOdd(int start, int end) {
			
		for(int i=0; i< end ;i++) {
				if (end<=0 || start<=0) {
					return -1;
				}
				else {
						
					}						
			}	
			return end;
	}
}
