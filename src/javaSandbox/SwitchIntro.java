package javaSandbox;

public class SwitchIntro {

	public static void main(String[] args) {

		char myChar = 'C';
		
		switch(myChar) {
			case 'A': 
				System.out.println( "this is the A");
				break;
			
			case 'B': 
				System.out.println( "this is the B");
				break;
				
			case 'C': 
				System.out.println( "this is the C");
				break;
				
			case 'D': 
				System.out.println( "this is the D");
				break;
				
			case 'E': 
				System.out.println( "this is the E");
				break;
				
			default:
			System.out.println( "this is not A, B, C, D, E");
		}
	}

}
