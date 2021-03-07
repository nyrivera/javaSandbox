// Nelson Rivera
package javaSandbox;
import java.util.Random;
import java.util.Scanner;
public class mathClassPractice {

	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
	      Random randGen = new Random();
	      int seedVal;
	      System.out.println("enter int");

	      seedVal = scnr.nextInt();
	      randGen.setSeed(seedVal);
	    
	      System.out.println(randGen.nextInt(10));
	      System.out.println(randGen.nextInt(10));
	   scnr.close();
	}

}
