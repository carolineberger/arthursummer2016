/**
 * Rainbow Drawing (v3.13)
 * by:  DexteredWards (2013/Feb)
 * mod: tfguy44
 * enh: GoToLoop
 * 
 * forum.processing.org/one/topic/help-making-rainbow-drawer
 */
 
import java.util.Queue;
import java.util.ArrayDeque;
 
static final int MAX_RAINBOWS = 02000, SPECTRUM = 0550, STEP = 2;
static final Queue<Rainbow> rainbows = new ArrayDeque(MAX_RAINBOWS);
 
static color shades;
 
void setup() {
  size(800, 600, JAVA2D);
  colorMode(HSB, SPECTRUM, 1, 1);
  frameRate(50);
  smooth(4);
  strokeWeight(Rainbow.BOLDNESS);
 
  keyPressed();
}
 
void draw() {
  if (rainbows.size() == MAX_RAINBOWS)   background(SPECTRUM);
  shades = (shades + STEP) % SPECTRUM;
  for (Rainbow bow: rainbows)   bow.display();
}
 
void keyPressed() {
  background(SPECTRUM);
  rainbows.clear();
  print("0\t");
}
 
void mouseDragged() {
  final int len = rainbows.size();
  final boolean isFull = len == MAX_RAINBOWS;
 
  rainbows.add(isFull? rainbows.remove().refresh() : new Rainbow());
  if (!isFull)   print(len+1 + "\t");
}
 
final class Rainbow {
  static final int BOLDNESS = 020;
 
  short cx, cy, px, py;
  color colour;
 
  Rainbow() {
    refresh();
  }
 
  Rainbow refresh() {
    cx = (short) mouseX;
    cy = (short) mouseY;
 
    px = (short) pmouseX;
    py = (short) pmouseY;
 
    colour = shades;
 
    return this;
  }
 
  void display() {
    stroke((colour + shades) % SPECTRUM, 1, 1);
    line(cx, cy, px, py);
  }
}