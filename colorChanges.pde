// problem: create a program in processing that when the mouse is clicked,
// an ellipse is formed and grows
  
// Click within the image to change 
// the value of the rectangle after
// after the mouse has been clicked
void setup(){
  size(300,300);
}
int value1 = 0; // setting value to 0 
int value2 =255;
void draw() {
//  fill (255,0,0); this doesn't work at all
  fill(value1, 0, value2); //fill(255,0,0) --> red
  rect(25, 25, 50, 50); //fill(0,0,255)
}

void mouseClicked() {
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
  // when value1 is equal (==) to 255, we want value2 to equal 0,
  // when value1 is equal (==) to 0, we want value2 to equal 255
  
}