/////////////////
//Siarra Fiol
//September 29, 2014
//HW 05 - Burger King
//This proogram prompts the user to enter a choice of a burger, a soda, or fries. Then the program prompts the users for details of their choices. 
//
//  first compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing

import java.util.Scanner; //import scanner

//  define a class
public class BurgerKing{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner; //declare scanner
            myScanner = new Scanner( System.in ); //construct scanner
            
            System.out.print(
                "Enter a letter to indicate a choice of Burgers (B/b), Soda (S/s), or Fries (F/f): "); //user will choose a menu option
               
                String letter = myScanner.next(); //letter variable
                
            
            if (letter.length() > 1) { //letter variable cannot be more than one char 
               System.out.println("Error: a single character expected."); //print error statement
            }
            else if (letter.equals("B") || letter.equals("b")) { //checks to see if string variable is equal to "B" or "b"
                System.out.println("What do you want on your burger?");
                System.out.println("Indicate: All the fixins(A/a), Cheese(C/c) or None of the above(N/n)"); //prompts user interaction
                String onBurger = myScanner.next(); //onBurger variable
                System.out.print("You have ordered a burger with "); //prints user's order
                
                switch (onBurger){
                    case "A": System.out.println("all the fixins."); break; 
                    case "a": System.out.println("all the fixins."); break;
                    case "C": System.out.println("cheese."); break;
                    case "c": System.out.println("cheese."); break;
                    case "N": System.out.println("none of the above."); break;
                    case "n": System.out.println("none of the above."); break;
                    default: System.out.println("an invalid option; try again."); break; //will print this statement if user input doesn't apply to any of the stated cases
                }
            }
            else if (letter.equals("S") || letter.equals("s")) { //checks to see if string variable is equal to "S" or "s"
                System.out.println("Do you want Pepsi (P/p), Coke (C/c), Sprite (S/s) or Mountain Dew (M/m)?"); //prompts user interaction
                String sodaType = myScanner.next(); //sodaType variable
                switch (sodaType){
                    case "P": System.out.println("You ordered a Pepsi."); break;
                    case "p": System.out.println("You ordered a Pepsi."); break;
                    case "C": System.out.println("You ordered a Coke."); break;
                    case "c": System.out.println("You ordered a Coke."); break;
                    case "S": System.out.println("You ordered a Sprite."); break;
                    case "s": System.out.println("You ordered a Sprite."); break;
                    case "M": System.out.println("You ordered a Mountain Dew."); break;
                    case "m": System.out.println("You ordered a Mountain Dew."); break;
                    default: System.out.println("You ordered an invalid option; try again."); break; //will print this statement if user input doesn't apply to any of the stated cases
                }
            }
            else if (letter.equals("F") || letter.equals("f")) { //checks to see if string variable is equal to "F" or "f"
                System.out.println("What size of fries do you want?"); 
                System.out.println("Indicate: Small(S/s), Medium(M/m) or Large(L/l)"); //prompts user interaction
                String frySize = myScanner.next(); //frySize variable 
                System.out.print("You have ordered a "); //prints user's order
                
                switch (frySize){
                    case "S": System.out.println("small fry."); break;
                    case "s": System.out.println("small fry."); break;
                    case "M": System.out.println("medium fry."); break;
                    case "m": System.out.println("medium fry."); break;
                    case "L": System.out.println("large fry."); break;
                    case "l": System.out.println("large fry."); break;
                    default: System.out.println("size that is invalid; try again."); break; //will print this statement if user input doesn't apply to any of the stated cases
                }
            }
            else {
                System.out.println("You did not enter any of B, b, S, s, F, or f."); //will print this statement if user enters an invalid menu option
            }
       
       
       
       
        }
              
} 
             
                
            