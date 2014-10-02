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

import java.util.Scanner; //import scanner

//  define a class
public class BigMacAgain{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner; //declare scanner
            myScanner = new Scanner( System.in ); //construct scanner
            
            System.out.print(
            "Enter the number of Big Macs(an integer > 0): "); //prompts user interaction
            
            if (myScanner.hasNextInt()) {
                int nBigMacs = myScanner.nextInt(); 
             
             //amount of good purchased
            int amntBigMacs = nBigMacs;
            //cost of good
            double bigMacCost$ = 2.22;
            //calculations
            double totalPriceBigMacs = amntBigMacs*bigMacCost$;
           
            
            if (nBigMacs > 0) {
                System.out.println("You ordered "+amntBigMacs+" Big Mac(s) for a cost of "+amntBigMacs+"x"+bigMacCost$+" = "+totalPriceBigMacs);
            }
            else {
                System.out.println("You did not enter an int > 0");
                    return;     //allows the program to run
                                //terminates the program
            }
            
            
            
            System.out.print(
                "Do you want an order of fries (Y/y/N/n)? "); //prompts user interaction
                
            
            String fryOrder = myScanner.next(); //fryOrder string variable
                
            //cost of good
            double friesCost$ = 2.15;
            double totalCost$ = friesCost$+totalPriceBigMacs;
            
            
            if (fryOrder.equals ("Y")) {
                System.out.println("You ordered fries at a cost of $2.15"); //if yes for fries, gives cost of just fries
                System.out.println("The total cost of the meal is $"+totalCost$); //if yes for fries, gives total cost of meal
            }
            else if (fryOrder.equals ("y")) {
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("The total cost of the meal is $"+totalCost$);
            }
            else if (fryOrder.equals ("N")) {
                System.out.println("The total cost of the meal is $"+totalPriceBigMacs); //if no for fries, gives cost of just Big Mac order
            }
            else if (fryOrder.equals ("n")) {
                System.out.println("The total cost of the meal is $"+totalPriceBigMacs);
            }
            else {
                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'"); //user did not enter valid choice
            }
            }
            else {
                System.out.println("You did not enter an int"); //user did not enter int
            }
            
            
                
            
           
             
            
            
            
            
        }        
            
}
    