import java.util.Scanner;
public class CCCCCC {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in); // create scanner object
		System.out.println("Enter a start value:");
		int startVal = userInput.nextInt();
		
		System.out.println("Enter a end value:");
		int end = userInput.nextInt();
		
		
		for (int x =startVal;x<=end;x=x+1){
			System.out.println("Paul is nice."+ (x));
		}

	}

}
