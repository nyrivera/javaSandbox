package javaSandbox;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		int minutes = 61 ;
		int seconds = 90435;
		
		System.out.println(getDurationString(minutes, seconds));
		System.out.println(getDurationString(seconds));	

	}
	
	public static String getDurationString(int minutes, int seconds) {
		if ((minutes > 0) && (seconds >=0 && seconds <=59)){
			String hours = String.valueOf(minutes/60);
			String minutesConv = String.valueOf(minutes%60);
			String secConv = String.valueOf(seconds);
			
			
			return hours + "h " + minutesConv +"m " + secConv + "s";
			
		}else {
			return "Invalid value";
		}
		
	
	}
	
	public static String getDurationString(int seconds) {
		if(seconds>0) {
			int hours = seconds/3600;
			int minutes = (seconds/60)%60;
			int secs = seconds%60;
			
			String hrs = String.valueOf(hours);
			String mins = String.valueOf(minutes);
			String sec = String.valueOf(secs);
			
					return hrs + "h " + mins +"m " + sec + "s";
		}else {return "invalid";
	}
	}
	
}
