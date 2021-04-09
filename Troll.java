package javaSandbox;

public class Troll {

	public static void main(String[] args) {
		String str= "This website is for losers LOL!";
		disemvowel(str);
	}
	
	public static String disemvowel(String str) {
		String newStr = str.toLowerCase();
		StringBuilder sb =new StringBuilder();
		String lastString = "";
				
		for (int i=0; i< newStr.length(); i++) {
			if ((newStr.charAt(i)!='a')&&(newStr.charAt(i)!='e')&&(newStr.charAt(i)!='i')&&(newStr.charAt(i)!='o') &&(newStr.charAt(i)!='u')) {
				sb.append(newStr.charAt(i));
			}
			
		}
		lastString=sb.toString();
		return lastString;
	}

}
