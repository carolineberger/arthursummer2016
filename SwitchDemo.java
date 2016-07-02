import java.util.Random;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
    	// so instead of just doing a random month.
    	// I want you to improve this program by guessing someone's birthday!
    	// just guess the day (number) and the month
    	// we already have the month, but be careful because each month
    	// has a different number of days.
    	// the month and day are printed at the console. 

    	Random rand = new Random(); //creates a new random object
    	int month = rand.nextInt(12) + 1; //uses that object to produce a random number from 1 to 12
        String monthString;
        
        //System.out.println(month); this is a debug statement, we figured out our error
        //default month, because our random number generator was printing/ giving zero
        //this helped up improve our code by looking at the java library
        
        switch (month) {
            case 1:  monthString = "January"; //31 days group 1
                     break;
            case 2:  monthString = "February"; //28 days group 2
                     break;
            case 3:  monthString = "March"; //31 days group 1
                     break;
            case 4:  monthString = "April";//30 days group 3
                     break;
            case 5:  monthString = "May"; //31 days group 1
                     break;
            case 6:  monthString = "June"; //30 days group 3
                     break;
            case 7:  monthString = "July"; //31 days group 1
                     break;
            case 8:  monthString = "August"; //31 days group 1
                     break;
            case 9:  monthString = "September"; //30 days group 3
                     break;
            case 10: monthString = "October"; //30 days group 3
                     break;
            case 11: monthString = "November"; //30 days group 3
                     break;
            case 12: monthString = "December"; //31 days group 1
                     break;
            default: monthString = "Invalid month"; //ALWAYS HAVE THIS!!! --> if your program is buggy it will catch your errors
                     break;
        }
        int day=0;
        if(month==1 || month==3 || month==5 || month==7 || month ==8 || month==12 ){ //if the month is eqaul to December, , , than produce a random number from 1 to the number of days in that month
        	//we can go up to 31 days
        	Random dayRand = new Random(); //creates a new random object
        	day = dayRand.nextInt(31) + 1;
        	
        }
        else if(month==4 || month ==6 || month==9|| month==10 || month==11){
        	Random dayRand = new Random(); //creates a new random object
        	day = dayRand.nextInt(30) +1;
        	
        }
        else if(month==2){
        	Random dayRand = new Random(); //creates a new random object
        	day = dayRand.nextInt(28) + 1;
        }
        //think about how to solve this problem
        //1. variables 
        //2. conditionals
        //3. switch case (see above) 
        System.out.println("your birthday is " + monthString + " "+ day +"?"); //word for month
        System.out.println("am i correct?");
        Scanner reader = new Scanner(System.in);
        String yesOrNo=reader.next();
        
        //System.out.println(yesOrNo); debug print statement
        
        if(yesOrNo.equals("yes")||yesOrNo.equals("Yes")||yesOrNo.equals("Y")||yesOrNo.equals("YES") ){ //string is equal to yes, print I knew so!
        	System.out.println("i knew so");
        }
        else{ //print sorry :(
        	System.out.println("Sorry :(");
        }
        
    }
}