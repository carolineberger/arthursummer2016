
public class CCCCCCCCC {
	public static void main(String[] args){
		//String[] seasons = {"Summer", "Fall", "Spring", "Winter"};
		//System.out.println(seasons[0]);
		String[] friends = {"Thibault", "Laurent","Marius", "Noah", "William"};
		printFriends(friends);
		
	}
	public static void printFriends(String[] one){
		System.out.println("in order from best to least best friend");
		int upBound = one.length;
		for (int i = 0; i < upBound; i ++){
			System.out.println(one[i]);	
		}
	}

}
