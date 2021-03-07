package javaSandbox;

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		int number = 111;
		
		System.out.println(sumDigits(number));
	}
	
	public static int sumDigits(int number){
			if(number <=9) {
				return -1;
			}else {
			int sum =0;
			int reminder = 0;
			
			while (number >0) {
				reminder = number%10;
				sum += reminder;
				number = number/10;
			}	
				return sum;
			}
	}
}