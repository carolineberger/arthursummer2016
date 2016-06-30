// problem: create a program in processing that when the mouse is clicked,
// an ellipse is formed and grows
void setup(){
  size(300,300);
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
  if(paul==0){
    xpos=xpos+25;
    ypos=ypos+25;
  }
  if(xpos>300){
    paul=1;
  }
  // when value1 is equal (==) to 255, we want value2 to equal 0,
  // when value1 is equal (==) to 0, we want value2 to equal 255
  
}