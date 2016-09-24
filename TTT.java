import java.util.Scanner;
public class TTT {
	public static Scanner in = new Scanner(System.in); 
	static String c1 = "c1";
	static String c2 = "c2";
	static String c3 = "c3";
	
	static String b1 = "b1";
	static String b2 = "b2";
	static String b3 = "b3";
	
	static String a1 = "a1";
	static String a2 = "a2";
	static String a3 = "a3";

	public static void main(String[] args) {
		System.out.println("choose language");
		System.out.println("1. english");
		System.out.println("2. french");
		System.out.println("3. spanish");
		int languagePreference = in.nextInt();
		if( languagePreference == 1){
			english(1);
		}
		else if ( languagePreference == 2){
			french(2);
			
		}
		else if(languagePreference == 3){
			spanish(3);
			
		}


	}
	
	public static void english(int languagePreference){
				System.out.println("English Mode");
				System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
				System.out.println("__b1____|___b2__|____b3__");
				System.out.println("__a1____|___a2__|____a3__");
				System.out.println("Player 1, where would you like to place your X?");
				String position1 = in.next();
				if (c1.equals(position1 )){
					c1 = "x";
				}
				else if (c2.equals(position1 )){
					c2 = "x";
				}
				
				System.out.println("__"+c1+"____|___"+c2+"__|____c3__");
				System.out.println("__b1____|___b2__|____b3__");
				System.out.println("__a1____|___a2__|____a3__");
				System.out.println("Player 1, where would you like to place your X?");
				String position2 = in.next();
				return;
				

	}
	public static void french(int languagePreference){
		
		System.out.println("French Mode");
		System.out.println("__c1____|___c2__|____c3__");
		System.out.println("__b1____|___b2__|____b3__");
		System.out.println("__a1____|___a2__|____a3__");
		
		System.out.println("Joueur 1, ou veux tu placer ton X?");
		String position1 = in.next(); 

	}
	public static void spanish(int languagePreference){
		System.out.println("Spanish Mode");
		System.out.println("__c1____|___c2__|____c3__");
		System.out.println("__b1____|___b2__|____b3__");
		System.out.println("__a1____|___a2__|____a3__");

		System.out.println("Jugador 1, donde quieres poner tu X?");
		String position1 = in.next(); 
	}

}
