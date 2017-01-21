
class Car{
  color c;
  int number_of_wheels;
  boolean roof_window;
  int possible_number_of_passengers;
  String owner;
  boolean sliding_door;
  int make_year;
  
  
  Car(color c, int number_of_wheels, boolean roof_window, 
  int possible_number_of_passengers, String owner, boolean sliding_door, int make_year){ //this is the constructor
     this.c = c;
     this.number_of_wheels = number_of_wheels;
     this.roof_window = roof_window;
     this.possible_number_of_passengers = possible_number_of_passengers;
     this.owner = owner;
     this.sliding_door = sliding_door;
     this.make_year = make_year;
  }
  int distanceTraveled(int xinitial, int xfinal){
    int kmTraveled = xfinal- xinitial;
    return kmTraveled;
    
  }
}
Car ArthurCar = new Car(color(201, 15, 51), 4, false, 5, "ME", false, -2000);
Car CarolineCar = new Car(color(100, 100, 55), 4, false, 5, "CAROLINE", false, 15000);


void setup(){
  int xCorSchool = 123;
  int xCorHome = 15;
  int homeToSchool = ArthurCar.distanceTraveled( xCorHome, xCorSchool );
  System.out.println("Km between home and school "+homeToSchool);
  
  System.out.println("Who is the owner of Arthur's Car? " + ArthurCar.owner);
  System.out.println("How many doors are there on Arthur's Car? " + ArthurCar.number_of_wheels);
  
  System.out.println("Who is the owner of Caroline's Car? " + CarolineCar.owner);
}

void draw(){
  rect(0,20,70,20);
  fill(ArthurCar.c);
}
