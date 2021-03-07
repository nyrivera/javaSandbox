package javaSandbox;
import java.util.Scanner;

public class CharacterAOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter a word: ");
		String userInput = scanner.nextLine();
		

		for (int i = 0; i< userInput.length(); i++ ) {
			
			
			
			
			System.out.println(userInput.charAt('a'));
			
		}
		
		
	scanner.close();
	
	}

}
