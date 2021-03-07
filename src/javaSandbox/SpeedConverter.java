package javaSandbox;

public class SpeedConverter {

	public static void main(String[] args) {
		double kilometersPerHour = 75.114;
		toMilesPerHour(kilometersPerHour);
		System.out.println((long)(toMilesPerHour(kilometersPerHour)));
		printConversion (kilometersPerHour);
	}
	
	public static long toMilesPerHour(double kilometersPerHour){
		
		if (kilometersPerHour >= 0) {
			double milesPerHour =(kilometersPerHour / 1.609);
			return Math.round(milesPerHour);
		}else {
			return -1;
		}
		
	}
	public static void printConversion(double kilometersPerHour) {
		
		if (kilometersPerHour >= 0) {
			double milesPerHour = kilometersPerHour /1.609;
			System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h");
		} else {
			System.out.println( "Invalid Value");
		}
		
	}

}
