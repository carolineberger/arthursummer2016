import java.util.Random;

public class SwitchDemo {
    public static void main(String[] args) {
    	// so instead of just doing a random month.
    	// I want you to improve this program by guessing someone's birthday!
    	// just guess the day (number) and the month
    	// we already have the month, but be careful because each month
    	// has a different number of days.
    	// the month and day are printed at the console. 

    	Random rand = new Random(); 
    	int month = rand.nextInt(12);
        String monthString;
        switch (month) {
            case 1:  monthString = "January"; //31 days
                     break;
            case 2:  monthString = "February"; //28 days
                     break;
            case 3:  monthString = "March"; //31 days
                     break;
            case 4:  monthString = "April";//30 days
                     break;
            case 5:  monthString = "May"; //31 days
                     break;
            case 6:  monthString = "June"; //30 days
                     break;
            case 7:  monthString = "July"; //31 days
                     break;
            case 8:  monthString = "August"; //31 days
                     break;
            case 9:  monthString = "September"; //30 days
                     break;
            case 10: monthString = "October"; //30 days
                     break;
            case 11: monthString = "November"; //30 days
                     break;
            case 12: monthString = "December"; //31 days
                     break;
            default: monthString = "Invalid month"; //ALWAYS HAVE THIS!!! --> if your program is buggy it will catch your errors
                     break;
        }
        //think about how to solve this problem
        //1. variables 
        //2. conditionals
        //3. switch case (see above) 
        System.out.println(monthString);
    }
}