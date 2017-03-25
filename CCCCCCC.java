import java.util.Scanner;

public class CCCCCCC {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in); // create scanner object
		System.out.println("Enter a number:");
		int num = userInput.nextInt();
		if(num%2==1){
			System.out.println("odd");	
		}
		else{
			System.out.println("even");	
		}
	}

}
