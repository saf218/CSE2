//
//Siarra Fiol
//September 16, 2014
//HW 3 - Root
//

import java.util.Scanner;

//  define a class
public class Root{
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        

    
    System.out.println("Enter a double, and I print its cube root: ");
    double x = myScanner.nextDouble();
    
    double guess1 = x/3;
    double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
    double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
    double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3); 
    double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4); 
    double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5); 
    
    
    System.out.println("The cube root is "+(guess6)+" :" );
    System.out.println(+guess6+"*"+guess6+"*"+guess6+"=");
    System.out.println(guess6*guess6*guess6);
    
    }    
}