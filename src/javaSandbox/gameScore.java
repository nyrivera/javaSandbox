package javaSandbox;
import java.util.Scanner;

public class gameScore {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println( "Provide Name and score:");
		String playerName = scan.next();
		int finalScore = scan.nextInt();
		int finalPosition = calculateHighScorePosition(finalScore);
		displayHighScorePosition(playerName, finalPosition, finalScore);
		scan.close();
		}
	
	public static void displayHighScorePosition (String playerName, int finalPosition, int finalScore) {
		System.out.println( playerName +" " + "is in position " + finalPosition + " with a score of " + finalScore );
	}
	
	public static int calculateHighScorePosition (int finalScore) {
		if (finalScore >= 4000) {
			return 1;
		}
		else if (finalScore <= 3999 && finalScore >= 3000){
			return 2;
		}
		else if (finalScore <= 2999 && finalScore >= 2000){
			return 3;
		}	
		else if (finalScore <= 1999 && finalScore >= 1000){
			return 4;
		}
		else if (finalScore <= 999 && finalScore >= 0){
			return 5;
		}
			return -1;
	};
};