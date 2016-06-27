import processing.core.PApplet;

// how to link processing
// step 1. public class NAME extends PApplet
// step 2. inside of main method, write PApplet.main("NAME");
// step 3. click import-->

public class CarRace extends PApplet{ // this is the program's name

	public static void main(String[] args) { 
		PApplet.main("CarRace");

	}
	public void settings(){
		size(400,400);
	}
	
	float x = 100;
	float y = 100;
	
	public void setup(){
		background(255);
	}
	public void draw(){
		background(255);
		display();
		move();
	}
	
	public void display(){
		fill(211,221,199);
		rect(x,y,30,20);
	}
	
	public void move(){
			y = y + 1;
			fill(y,221,199);
			if(y > height){
				y = -30;  //You CAN set locations to be negative!
			}
		
		
	}
	

}
