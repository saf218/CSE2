//
//Siarra Fiol
//September 12, 2014
//CSE 2
//Lab 03-BigMac
//
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac
//  output should compute the cost of a Big Mac

import java.util.Scanner;

//  define a class
public class BigMac {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
        
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as"+
        " a double (in the form xx.xx): " );
        double bigMacs$ = myScanner.nextDouble();
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want
            //proportion
                
        double cost$;
        int dollars,  //whole dollar amount of cost
                dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
        cost$ = nBigMacs*bigMacs$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the percent (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        System.out.println("The total cost of " +nBigMacs
         +" BigMacs, at $"+bigMacs$ +" per bigMac, with a" +
         " sales tax of "+ (int)(taxRate*100) + " %, is $ "
         +dollars+'.'+dimes+pennies);
        
    }   //end of main method
}   //end of class