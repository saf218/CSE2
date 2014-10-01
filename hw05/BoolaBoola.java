/////////////////
//Siarra Fiol
//September 29, 2014
//HW 05 - Boola Boola
//Combines three boolean variables at random to random choices of && and || and stores the result. The program should then present the expression to the user and ask the user to state the result of of the expression.
//
//  first compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola

import java.util.Scanner; //import scanner

//  define a class
public class BoolaBoola{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner; //declare scanner
            myScanner = new Scanner( System.in ); //construct scanner
            
            int random = (int) (Math.random()*10); //call math.random function 
            
            boolean bool1; //initialize boolean variable bool1
            bool1 = random <5 ? true:false;
            
            System.out.print("Does " + bool1);
            
            random = (int) (Math.random()*10); //call math.random function
            
            boolean bool2; //initialize boolean variable bool2
            bool2 = random <5 ? true:false;
            
            if (bool2==true) {
                System.out.print(" && ");
            }
            else if (bool2==false) {
                System.out.print(" || ");
            }
            
            random = (int) (Math.random()*10); //call math.random function
            
            boolean bool3; //initialize boolean variable bool3
            bool3 = random <5 ? true:false;
            
            if (bool3==true) {
                System.out.print( bool3 );
            }
            else if (bool3==false) {
                System.out.print( bool3 );
            }
            
            random = (int) (Math.random()*10); //call math.random function
            
            boolean bool4; //initialize boolean variable bool4
            bool4 = random <5 ? true:false;
            
            if (bool4==true) {
                System.out.print(" && ");
            }
            else if (bool4==false) {
                System.out.print(" || ");
            }
            
            random = (int) (Math.random()*10); //call math.random function
            
            boolean bool5; //initialize boolean variable bool5
            bool5 = random <5 ? true:false;
            
            if (bool5==true) {
                System.out.print( bool5 );
            }
            else if (bool5==false) {
                System.out.print( bool5 );
            }
           
           
           System.out.print(" have the value true(t/T) or false(f/F)?");
           String bool = myScanner.next();
           
           
           
        }
}
            
            
            
            