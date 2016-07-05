
  
import processing.sound.*;
SoundFile file;

float value1 = 0; // setting value to 0 
float value2 =0;
float value3=0;
int xpos=0;
int ypos =125;
int paul=0;
int i =0;
void setup() {
  size(300, 300);
  file = new SoundFile(this, "../Desktop/bestProgramYet.m4a");
  file.play();

}
void draw() {
  //i = i + 1; //here the counter increases by one each frame
  
 //i//f (i>50){ //when the counter gets over 50 then this is positive
  // background(255,0,0); //every 2D primitive will be RED if drawn now
// }//
  
 //i//f (i>100){ //when the counter gets over 100 then this is positive
  // background(255);  //every 2D primitive will be WHITE if drawn now
  // i=0;  //resets the counter to start the flashing loop over
 //}//
}
void mouseClicked() {
  fill(value1, value3, value2);
  rect(xpos, ypos, 50, 50);
  value1= random(0, 255);
  value2=random(0,255);
  value3=random(0,255);
  if(paul==0){ //THIS BLOCK OF CODE IS THE ONE THAT CHANGES THE POSITION OF THE CIRCLES
    xpos=xpos+50;

  }
  else{ //THIS BLOCK OF CODE IS THE ONE THAT CHANGES THE POSITION OF THE CIRCLES
  
    //print(xpos); // our xpos and ypos are changing BUT its not being drawn
    ypos=ypos+50;
  }
  if(xpos>250){ //greater than or equal to
    paul=1; // PAUL IS NOW 1!! 
    //we want it to be in the center at the top edge
    xpos=125;
    ypos=0;
  }
  //stop the program after xpos is less than 0
  if(ypos>300){ //this is when the cross is done
  // where we put the sound
    exit();
  }
}