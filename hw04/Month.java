/////////////////
//Siarra Fiol
//September 23, 2014
//HW 4 - Month
//This program prompts the user to enter an integer for the month and then displays the number of days in the month.
//
//  first compile the program
//      javac Month.java
//  run the program
//      java Month

import java.util.Scanner;//import scanner

//  define a class
public class Month{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner;//declare scanner 
            myScanner = new Scanner( System.in );//construct scanner
            
            System.out.print(
                "Enter an int giving the number of the month (1-12): ");//user input
                
            if (myScanner.hasNextInt()) {
                int month = myScanner.nextInt();//month variable
                
             if (month == 4 || month == 6 || month == 9 || month == 11) {
                 System.out.println("This month has 30 days.");//months with 30 days
             }
             if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                 System.out.println("This month has 31 days.");//months with 31 days
             }
             if (month == 2) {
               System.out.print("Enter the year: ");//determines whether or not a year was a leap year
                int year = myScanner.nextInt();//year variable
                  if (year%4 == 0) {
                      System.out.println("This month has 29 days.");//leap year
                  }
                  else {
                      System.out.println("This month has 28 days.");//not a leap year
                  }
             }
             
            
                  else if (month <1 || month >12) {
                      System.out.println("You did not enter an int between 1 and 12.");//not a valid int for a month
                  }
            }      
        }//end of main method 
}//end of class
               
            