package javaSandbox;
import java.util.Scanner;

	public class CalcPyramidVolume {
	  public static double pyramidVolume(double userLength, double userWidth, double userHeight){
	     double baseLength = userLength;
	     double baseWidth = userWidth;
	     double pyramidHeight =userHeight;
	     double volume;
	     
	     volume = (((baseLength * baseWidth) * pyramidHeight) *(1/3));
	     return volume;
	  }  


	   public static void main (String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      double userLength;
	      double userWidth;
	      double userHeight;

	      userLength = 1;
	      userWidth = 1;
	      userHeight = 1;

	      System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
	      scnr.close();
	   }
	}
	