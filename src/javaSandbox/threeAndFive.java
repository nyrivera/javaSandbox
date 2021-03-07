package javaSandbox;



public class threeAndFive {

	public static void main(String[] args) {
		int number =10;
		
		System.out.println(solution(number));
	}
	
	public static int solution(int number) {
		int sum =0;
		for (int i=0; i<number; i++) {
			if((i%5==0||i%3==0) && i!=0) {
				sum =sum+i;
			}
		} return sum;
	}
 }

	
	

