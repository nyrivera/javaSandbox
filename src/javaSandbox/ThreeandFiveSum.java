package javaSandbox;

public class ThreeandFiveSum {

	public static void main(String[] args) {
	
		int numberOne;
		int addNum = 0;
		int count = 0;
		
		for (numberOne = 1; numberOne<= 1000; numberOne ++) {
			if (numberOne%3 == 0 && numberOne%5 == 0) {
				count ++;
				addNum += numberOne ;
				System.out.println(numberOne);
					if (count == 5) {
						break;}
							}
		
		}
		System.out.println(addNum);
	}

}


//Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//Sum all the numbers that can be divided with both 3 and also with 5.
//
//For those numbers that met the above conditions, print out the number.
//
//break out of the loop once you find 5 numbers that met the above conditions.
//
//After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//Note: Type all code in main method 