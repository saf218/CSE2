/////////////////
//Siarra Fiol
//September 23, 2014
//HW 4 - Income Tax
//User will enter an int greater than or equal to zero (which represents income) and the program will write out the tax rate on the income and the amount of tax.
//
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax

import java.util.Scanner;//import scanner

//  define a class
public class IncomeTax{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner;//declare scanner
            myScanner = new Scanner( System.in );//construct scanner
            
            System.out.print(
                "Enter an int giving the number of thousands (an int >=0): ");//user input
                
               
                
                
                
            if(myScanner.hasNextInt()) {
              int income = myScanner.nextInt();//income variable 
                if (income<20 && income>0)  {
                    System.out.println("The tax rate on "+(income*1000)+" is 5%, and the tax is "+(income*.05*1000)+" .");//gives tax rate on income greater than 20,000 and tax 
                }
                if (income<40 && income>=20) {
                    System.out.println("The tax rate on "+(income*1000)+" is 7%, and the tax is "+(income*.07*1000)+" .");//gives tax rate on income greater than or equal to 20,000 and less than 40,000 and tax
                }
                if (income<78 && income>=40) {
                    System.out.println("The tax rate on "+(income*1000)+" is 12%, and the tax is "+(income*.12*1000)+" .");//gives tax rate on income greater than or equal to 40,000 and less than 78,000 and tax
                }
                if (income>=78) {
                    System.out.println("The tax rate on "+(income*1000)+" is 14%, and the tax is "+(income*.14*1000)+" .");//gives tax rate on income greater than or equal to 78,000 and tax
                }
                if (income<0) {
                    System.out.println("You did not enter a positive int.");//not a positive int
                }
            }
                    else{
                        System.out.println("You did not enter an int.");//not an int
                        return;    
                    }    
            
                

  }//end of main method
}//end of class