/////////////////
//Siarra Fiol
//September 23, 2014
//HW 4 - Time Padding
//The user will enter a positive integer giving the number of seconds that have passed during the day and then displays the time in conventional form.
//
//  first compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding

import java.text.DecimalFormat;//import decimal format
import java.util.Scanner;//imports scanner

//  define a class
public class TimePadding{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner;//declare scanner
            myScanner = new Scanner( System.in );//construct scanner
            DecimalFormat d = new DecimalFormat("00");//formats time correctly 
            
            System.out.print(
                "Enter the time in seconds: ");//user input
            if (myScanner.hasNextInt()) {
                int seconds = myScanner.nextInt();//variable seconds
                
             if (seconds<0) {
                 System.out.println("Time cannot be negative.");//if user input is a negative number
             }
             
             if (seconds>=0 && seconds <60) {
                 System.out.println("The time is 0:00:"+seconds);//this only shows time in seconds
             }
             
             
             //variables
             int minutes = seconds/60;
             int extraSeconds = seconds%60;
             
             if (seconds >=60 && seconds <3600) {
                 System.out.println("The time is 0:"+d.format(minutes)+":"+d.format(extraSeconds*100/100));//this only shows time in minutes and seconds
             }
             
             int hours = seconds/3600;//hours variable
             if (seconds >=3600) {
                 System.out.println("The time is "+hours+":"+d.format(minutes-(hours*60))+ ":" +d.format(extraSeconds));//time in hours, minutes, and seconds
             }
             
            }
        }//end of main method
}//end of class