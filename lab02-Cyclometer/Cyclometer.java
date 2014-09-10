
//Siarra Fiol
//September 5, 2014
//CSE 2
//Cyclometer
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
//  add main method
public static void main(String[] args) {

//our input data
  int secsTrip1=480; //input seconds of trip 1
  int secsTrip2=3220; //input seconds of trip 2
  int countsTrip1=1561; //input counts of trip 1
  int countsTrip2=9037; //input counts of trip 2
  
//our intermediate variables and output data
double wheelDiameter=27.0, //
PI=3.14159, //
feetPerMile=5280, //
inchesPerFoot=12, //
secondsPerMinute=60; //
double distanceTrip1, distanceTrip2, totalDistance; //

System.out.println(" Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts. ");
System.out.println(" Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts. ");

//run the calculations; store the values.
//
//
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data
System.out.println(" Trip 1 was "+distanceTrip1+" miles");
System.out.println(" Trip 2 was "+distanceTrip2+" miles ");
System.out.println(" The total distance was "+totalDistance+" miles ");
    
    
    
    
    
} //end of main mehtod
} //end of class