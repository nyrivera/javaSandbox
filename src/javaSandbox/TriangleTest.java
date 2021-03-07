package javaSandbox;

public class TriangleTest {

	public static void main(String[] args) {
		int a= 1;
		int b = 2;
		int c = 2;
		
		System.out.println(isTriangle(a, b, c));

	}
	public static boolean isTriangle(int a, int b, int c) {
		double surface = (double)(a + b + c)/2;


		double area = surface * (surface - a) * (surface - b) * (surface - c);


		double  result = Math.sqrt(area);
		System.out.println( result);

		if (result <= 0 || result != result) {
			return false;	
		}else {
			return true; 
		}
		
		
	}
}
