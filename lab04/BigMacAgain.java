//
//Siarra Fiol
//September 19, 2014
//Lab 4 - Big Mac Again
//Scanner class will ask users if they want fries with their Big Mac and then compute the cost of a meal with or without fries
//
//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain

import java.util.Scanner;

//  define a class
public class BigMacAgain{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
            System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
            
            int nBigMacs = myScanner.nextInt();
            
            //amount of good purchased
            int amntBigMacs = myScanner.nextInt();
            //costs of goods
            double bigMacCost$ = 2.22;
            double friesCost$ = 2.15;
            //calculations
            double totalPriceBigMacs = amntBigMacs*bigMacCost$;
            
            if(myScanner.hasNextInt() > 0){
                System.out.print("You ordered "+amntBigMacs+" Big Macs for a cost of "+amntBigMacs+"x"+bigMacCost$+" = "+totalPriceBigMacs+".");
            }
            else{
                System.out.println("You did not enter an int");
                return;     //allows the program to run
                                //terminates the program
                                
            }
            
            
            
            
            
            
            
}
    }