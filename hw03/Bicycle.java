//
//Siarra Fiol
//September 14, 2014
//HW 3 - Bicycle
//

import java.util.Scanner;

//  define a class
public class Bicycle{
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //constants for calculations
        double wheelDiameter=27.0; //inches
        double PI=3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        int secondsPerMinute=60;
        int minutesPerHour=60;
        
        //input
        System.out.print("Enter the number of seconds:");
        double nSeconds = myScanner.nextDouble();
        System.out.print("Enter the number of counts:");
        int nCounts = myScanner.nextInt();
        
        
        
        double distanceInMiles=(wheelDiameter*PI*nCounts)/inchesPerFoot/feetPerMile; 
        
        System.out.println("The distance was "+(distanceInMiles)+ " miles and took "+(nSeconds/secondsPerMinute)+" minutes.");
        
        double time= (nSeconds/secondsPerMinute)/minutesPerHour;
        double averageMilesPerHour= distanceInMiles/time;
        
        System.out.println("The average mph was "+averageMilesPerHour+".");
            
         
    
    }
}