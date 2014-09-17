//
//Siarra Fiol
//September 16, 2014
//HW 3 - FourDigits
//

import java.util.Scanner; //import scanner class

//  define a class
public class FourDigits{
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner ( System.in ); //creating an instance that will take input from STDIN
        
        //print statement
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double anyDouble = myScanner.nextDouble(); //accept double
        
        //casted double to int
        int anyDouble1 = (int)(anyDouble*10000); 
        int anyDouble2 = (int)(anyDouble1 % 10);
        int anyDouble3 = (int)(anyDouble1/10) % 10;
        int anyDouble4 = (int)(anyDouble1/100) % 10;
        int anyDouble5 = (int)(anyDouble1/1000) % 10;
        
        //print statement
        System.out.print("The four digits are: "+anyDouble5+anyDouble4+anyDouble3+anyDouble2+".");
        
    }
}