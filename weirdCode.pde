
void setup(){
  size(200, 200);

}

void draw(){
  //now fill the entire window with 20 by 20 rectangles -->
  //think which parameters (numbers) need to change each time???
  //the last two numbers ARE NOT going to change
  //next, with only at maximum 10 lines of code (don't count the comment only lines)
  //make 100 20 by 20 rectangles that fill the entire window.
  
  // these lines have to repeat themselves 5 times, but what has to change each time??
  // 
  //fill(153);
  for(int xpos=0; xpos<=180; xpos=xpos+20){
    for( int ypos=0; ypos<=180; ypos=ypos+20){
      fill( ypos,xpos,ypos);
      rect( xpos, ypos, 20,20);
    }
    
  }
  //rect(0,0,20,20);
  //fill(0);
  //rect(20,20,20,20);
  //fill(100);
  //rect(0,20,20,20);
  //fill(120);
  //rect(20,0,20,20); 
  //srepet5times
  
  
}