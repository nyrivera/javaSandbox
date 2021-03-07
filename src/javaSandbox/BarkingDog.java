package javaSandbox;

public class BarkingDog {

	public static void main(String[] args) {
		
		boolean barking = true;
		int hourOfDay = 11;
		System.out.println(shouldWakeUp(barking, hourOfDay));
	
	}
		
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
			
		if(barking) {
			if ((hourOfDay >= 0 && hourOfDay <= 24) && (hourOfDay < 8 || hourOfDay > 2)){
				return true;
			}
		}
				return false;			
	}
}