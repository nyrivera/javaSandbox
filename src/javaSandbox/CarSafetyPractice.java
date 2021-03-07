package javaSandbox;
import java.util.Scanner;

public class CarSafetyPractice {

	public static void main(String[] args) {
		 int carYear = 1999;

	      Scanner input = new Scanner(System.in);
	      carYear = input.nextInt();

	     if (carYear < 1968) {
	    	 System.out.println("Probably has few safety features.");
	     } if (carYear>1969) {
	    	 System.out.println("Probably has head rests.");
	     } if (carYear>1991){
	    	 System.out.println("Probably has electronic stability control.");
	     } if (carYear>2002){
	    	 System.out.println("Probably has tire-pressure monitor.");
	     }
	    	
	     input.close();
	   }
	}


