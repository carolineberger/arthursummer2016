
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
  // speeding up the color change, without everything turning yellow!!!!
  int x=2;
  int r = 255; //these are variables of type int
  int g = 0; 
  int b = 0;
  
  for(int xpos=0; xpos<=180; xpos=xpos+20){
    for( int ypos=0; ypos<=180; ypos=ypos+20){
       fill(r,g,b);
       if(g < 255 && b == 0) // asking a question- this is say is g less than 255 AND is
       // b equal to 0; if these two conditions are true than the code in 
       // between the brakets happens!
      {
         g = g + x; // now g=5
      }

  //Yellow to green
  if (g == 255 && b == 0) 
  {
    if(r >= 0)
    {
      r = r - x;
    }
  }

  //Green to cyan
  if (r == 0 && g == 255) 
  {
    if(b < 255)
    {
      b = b + x;
    }
  }
  //cyan to blue
  if (b == 255 && r == 0)
  {
    if(g > 0)
    {
       g = g - x;
    }
  }
  //Purple to magenta
  if (b == 255 && g == 0) 
  {
    if(r < 255)
    {
      r = r + x;
    }
  }
  
  //magenta to red
  if(r == 255 && g == 0)
  {
    if(b > 0)
    {
      b = b - x;
    }
  }// what we want is for each othe squares to change color ** being annimated
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