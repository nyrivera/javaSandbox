package javaSandbox;
public class WhileLoopEx1 {

	public static void main(String[] args){
		
		int myNum = 4;
		int finalNum= 24;
		
		while (myNum <= finalNum) {
			myNum ++;
			if (!isEvenNumber(myNum)) {
				continue;
			}
			System.out.println( "This is an even number: " + myNum);
		}
		
	}
	
	public static boolean isEvenNumber(int myNum) {
		if (myNum%2 == 0) {
				return true;}
		return false;
		}
}
