// problem: create a program in processing that when the mouse is clicked,
// an ellipse is formed and grows
void setup(){
  size(300,300);
  background(255);
  
}
int value1 = 0; // setting value to 0 
int value2 =255;
int xpos=25;
int ypos =25;
int paul=0;
void draw() {
//  fill (255,0,0); this doesn't work at all
  fill(value1, 0, value2); //fill(255,0,0) --> red
   //fill(0,0,255)
}

void mouseClicked() {
  fill(value1, 0, value2);
  ellipse(xpos, ypos, 50, 50);
  print("after drawing", xpos, ypos, "\n");
  // the color is changing
  if (value1 == 0) {
    value1 = 255;
  } else {
    value1 = 0;
  }
  if(value1==255){
    value2=0;
  }
  if(value1==0){
    value2=255;
  }
  if(paul==0){ //THIS BLOCK OF CODE IS THE ONE THAT CHANGES THE POSITION OF THE CIRCLES
    xpos=xpos+25;
    ypos=ypos+25;
  }
  else{ //THIS BLOCK OF CODE IS THE ONE THAT CHANGES THE POSITION OF THE CIRCLES
    //print("hi");
    xpos=xpos-25;  //condition has to be is 1 so that block of code is read
    //print(xpos); // our xpos and ypos are changing BUT its not being drawn
    ypos=ypos+25;
  }
  if(xpos>=300){ //greater than or equal to
    paul=1; // PAUL IS NOW 1!! 
    xpos=275;
    ypos=25;
  }
  //stop the program after xpos is less than 0
  if(xpos<0){
    exit();
  }
  
 //print(paul);
  // when value1 is equal (==) to 255, we want value2 to equal 0,
  // when value1 is equal (==) to 0, we want value2 to equal 255
  
}