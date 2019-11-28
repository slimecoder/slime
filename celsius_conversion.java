//import a scanner from the util package 

import java.util.Scanner;

//declacre the class as celsius_conversion

public class celsius_conversion{


//call the main method 

   public static void main(String [] args){
   
   //creat an input varible of type scanner 
   
      Scanner input = new Scanner(System.in);
      
      //ask for the celsius 
      
      System.out.print("Enter the degree in Celsius" + " " );
      
      //invoke the nextDouble method on the scanner object input
      
      int Celsius = input.nextInt();
      
      //convert to fahrenheit
      
      double Fahrenheit = ((9.0/5)* Celsius) + 32;
      
      //print result to the screen 
      System.out.println(Celsius + " " + "degrees Celsius is" + " " + Fahrenheit + " " + " degrees Fahrenheit.");
   
   
   }


}