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

	
		int winnerNumber = 0;
		int turns = 0; //for tie game
		
		System.out.println("English Mode");
		
		while(winnerNumber == 0){
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
			System.out.println("Player 1, where would you like to place your X?");
			String position1 = in.next();
			if (c1.equals(position1 )){
				c1 = "x";
			}
			else if (c2.equals(position1 )){
				c2 = "x";
			}
			else if(c3.equals(position1 )){
				c3 = "x";
			}
			else if(a1.equals(position1 )){
				a1 = "x";
			}
			else if(a2.equals(position1 )){
				a2 = "x";
			}
			else if(a3.equals(position1 )){
				a3 = "x";
			}
			else if (b1.equals(position1 )){
				b1 = "x";
			}
			else if (b2.equals(position1 )){
				b2 = "x";
			}
			else if (b3.equals(position1 )){
				b3 = "x";
			}
			
			if(c2 == "x" && b2 == "x" && a2 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b1 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && c2 == "x" && c3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(a1 == "x" && a2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(b1 == "x" && b2 == "x" && b3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b2 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b3 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
	
			if (winnerNumber ==1){
				break;
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
	
			System.out.println("Player 2, where would you like to place your o?");
			String position2 = in.next();
			if (c1.equals(position2 )){
				c1 = "o";
			}
			else if (c2.equals(position2 )){
				c2 = "o";
			}
			else if(c3.equals(position2 )){
				c3 = "o";
			}
			else if(a1.equals(position2 )){
				a1 = "o";
			}
			else if(a2.equals(position2 )){
				a2 = "o";
			}
			else if(a3.equals(position2 )){
				a3 = "o";
			}
			else if (b1.equals(position2 )){
				b1 = "o";
			}
			else if (b2.equals(position2 )){
				b2 = "o";
			}
			else if (b3.equals(position2 )){
				b3 = "o";
			}
			System.out.println("-----------------------");
			
			if(c2 == "o" && b2 == "o" && a2 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b1 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && c2 == "o" && c3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(a1 == "o" && a2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(b1 == "o" && b2 == "o" && b3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b2 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b3 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
		}
		if (winnerNumber == 0){
			System.out.println("Tie game!");
		}
		System.out.println("Player number " + winnerNumber + " won!");
				return;
				

	}
	public static void french(int languagePreference){
		
		
		int winnerNumber = 0;
		int turns = 0; //for tie game
		
		System.out.println("Mode Francais");
		
		while(winnerNumber == 0){
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
			System.out.println("Joueur 1, ou veux tu placer ton X?");
			String position1 = in.next();
			if (c1.equals(position1 )){
				c1 = "x";
			}
			else if (c2.equals(position1 )){
				c2 = "x";
			}
			else if(c3.equals(position1 )){
				c3 = "x";
			}
			else if(a1.equals(position1 )){
				a1 = "x";
			}
			else if(a2.equals(position1 )){
				a2 = "x";
			}
			else if(a3.equals(position1 )){
				a3 = "x";
			}
			else if (b1.equals(position1 )){
				b1 = "x";
			}
			else if (b2.equals(position1 )){
				b2 = "x";
			}
			else if (b3.equals(position1 )){
				b3 = "x";
			}
			
			if(c2 == "x" && b2 == "x" && a2 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b1 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && c2 == "x" && c3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(a1 == "x" && a2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(b1 == "x" && b2 == "x" && b3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b2 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b3 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
	
			if (winnerNumber ==1){
				break;
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
	
			System.out.println("Joueur 2, ou veux tu placer ton O?");
			String position2 = in.next();
			if (c1.equals(position2 )){
				c1 = "o";
			}
			else if (c2.equals(position2 )){
				c2 = "o";
			}
			else if(c3.equals(position2 )){
				c3 = "o";
			}
			else if(a1.equals(position2 )){
				a1 = "o";
			}
			else if(a2.equals(position2 )){
				a2 = "o";
			}
			else if(a3.equals(position2 )){
				a3 = "o";
			}
			else if (b1.equals(position2 )){
				b1 = "o";
			}
			else if (b2.equals(position2 )){
				b2 = "o";
			}
			else if (b3.equals(position2 )){
				b3 = "o";
			}
			System.out.println("-----------------------");
			
			if(c2 == "o" && b2 == "o" && a2 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b1 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && c2 == "o" && c3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(a1 == "o" && a2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(b1 == "o" && b2 == "o" && b3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b2 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b3 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
		}
		if (winnerNumber == 0){
			System.out.println("égalité!");
		}
		System.out.println("Joueur # " + winnerNumber + " gagné!");
				return;
				

	}
	public static void spanish(int languagePreference){


		
		int winnerNumber = 0;
		int turns = 0; //for tie game
		
		System.out.println("Modo Español");
		
		while(winnerNumber == 0){
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
			System.out.println("Jugador 1, donde quieres poner tu X?");
			String position1 = in.next();
			if (c1.equals(position1 )){
				c1 = "x";
			}
			else if (c2.equals(position1 )){
				c2 = "x";
			}
			else if(c3.equals(position1 )){
				c3 = "x";
			}
			else if(a1.equals(position1 )){
				a1 = "x";
			}
			else if(a2.equals(position1 )){
				a2 = "x";
			}
			else if(a3.equals(position1 )){
				a3 = "x";
			}
			else if (b1.equals(position1 )){
				b1 = "x";
			}
			else if (b2.equals(position1 )){
				b2 = "x";
			}
			else if (b3.equals(position1 )){
				b3 = "x";
			}
			
			if(c2 == "x" && b2 == "x" && a2 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b1 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && c2 == "x" && c3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(a1 == "x" && a2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(b1 == "x" && b2 == "x" && b3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c1 == "x" && b2 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b2 == "x" && a1 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
			else if(c3 == "x" && b3 == "x" && a3 == "x"){
				//player 1 won
				winnerNumber = 1;
			}
	
			if (winnerNumber ==1){
				break;
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
			System.out.println("__"+c1+"____|___"+c2+"__|____"+c3+"__");
			System.out.println("__"+b1+"____|___"+b2+"__|____"+b3+"__");
			System.out.println("__"+a1+"____|___"+a2+"__|____"+a3+"__");
	
			System.out.println("Jugador 2, donde quieres poner tu O?");
			String position2 = in.next();
			if (c1.equals(position2 )){
				c1 = "o";
			}
			else if (c2.equals(position2 )){
				c2 = "o";
			}
			else if(c3.equals(position2 )){
				c3 = "o";
			}
			else if(a1.equals(position2 )){
				a1 = "o";
			}
			else if(a2.equals(position2 )){
				a2 = "o";
			}
			else if(a3.equals(position2 )){
				a3 = "o";
			}
			else if (b1.equals(position2 )){
				b1 = "o";
			}
			else if (b2.equals(position2 )){
				b2 = "o";
			}
			else if (b3.equals(position2 )){
				b3 = "o";
			}
			System.out.println("-----------------------");
			
			if(c2 == "o" && b2 == "o" && a2 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b1 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && c2 == "o" && c3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(a1 == "o" && a2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(b1 == "o" && b2 == "o" && b3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c1 == "o" && b2 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b2 == "o" && a1 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			else if(c3 == "o" && b3 == "o" && a3 == "o"){
				//player 2 won
				winnerNumber = 2; 
			}
			turns ++;
			if (winnerNumber == 0 && turns == 9){
				break;
			}
		}
		if (winnerNumber == 0){
			System.out.println("juego empatado!");
		}
		System.out.println("Jugador # " + winnerNumber + " ganasté!");
				return;

	}

}
