/////////////////
//Siarra Fiol
//September 26, 2014
//Lab 5 
//This program uses the Scanner class to obtain from the user one of three choices for a game of chance.
//
//  first compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames

import java.util.Scanner; //import scanner

//  define a class
public class RandomGames{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner; //declare scanner
            myScanner = new Scanner( System.in ); //construct scanner
            
            System.out.print(
                "Enter R or r for Roulette, C or c for Craps, P or p for pick a card: "); //user will choose a game option
                
                String game = myScanner.next(); //game variable
            
            if (game.length() > 1) { //letter variable cannot be more than one char 
               System.out.println("Error: a single character expected."); //print error statement
            }
            else if (game.equals("R") || game.equals("r")) { //checks to see if string variable is equal to "R" or "r"
                int roulette = (int) (Math.random()*37); //math.random includes 37 numbers including 00
                System.out.println("Roulette: "+roulette);
                if (roulette == 37) {
                    System.out.println("Roulette: 00"); //roulette will print 00 if it gets the number 37 because the range of math.random does not include 00
                }
            }
            else if (game.equals("C") || game.equals("c")) { //checks to see if string variable is equal to "C" or "c"
                int craps1 = (int) (Math.random()*6+1);
                int craps2 = (int) (Math.random()*6+1);
                int craps3 = craps1+craps2;
                System.out.println("Craps: "+craps1+" + "+craps2+" = "+craps3);
            }
            else if (game.equals("P") || game.equals("p")) { //checks to see if string variable is equal to "P" or "p"
                System.out.println("Picking a card not implemented yet");
            }
            else {
                System.out.println("Error: you did not enter any of R, r, C, c, P, or p."); //will print this statement if user enters an invalid game option
            }
       
        }
        
        
}