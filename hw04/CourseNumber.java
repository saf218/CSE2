/////////////////
//Siarra Fiol
//September 23, 2014
//HW 4 - Course Number
//This program reads in a 6 digit number, makes sure that it adheres to the above description, and then prints out the semester and year. 
//
//  first compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber

import java.util.Scanner;//import scanner

//  define a class
public class CourseNumber{
    
        //  add main method
        public static void main(String[] args){
            
            Scanner myScanner;//declare scanner
            myScanner = new Scanner( System.in );//construct scanner
            
            System.out.print(
                "Enter a six digit number giving the course semester: ");//user input
            if (myScanner.hasNextInt()) {
                //variables
                int courseNumber = myScanner.nextInt();
                int semester = courseNumber%100;
                int year = courseNumber/100;
             
             if (courseNumber >= 186510 && courseNumber <=201440){
                if (semester==10) {
                    System.out.println("The course was offered in the spring semester of "+year);//if the last two digits are "10" then this course took place during the spring semester
                }
                else if (semester==20) {
                    System.out.println("The course was offered in the summer 1 semester of "+year);//if the last two digits are "20" then this course took place during the summer 1 semester
                }
                else if (semester==30) {
                    System.out.println("The course was offered in the summer 2 semester of "+year);//if the last two digits are "30" then this course took place during the summer 2 semester
                }
                else if (semester==40) {
                    System.out.println("The course was offered in the fall semester of "+year);//if the last two digits are "40" then this course took place during the fall semester
                }
                else {
                    System.out.println("This is not a legitimate semester.");//the last two digits did not end in 10, 20, 30, or 40
                }
             }   
                else {
                    System.out.println(" This course was outside of the range [186510,201440].");//outside range of years
                }
                 
                 
                 
                 
             
            }
        }//end of main method
}//end of class