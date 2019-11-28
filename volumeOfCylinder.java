import java.util.Scanner; //import scanner class from java util package 

public class volumeOfCylinder{


   public static void main(String [] args){ // invoke the main method 
   
   //create scanner object
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the radius of your cylinder");
   
   double radius = input.nextDouble();
   
   System.out.print("Enter the length of your cylinder");
   
   double length = input.nextDouble();
   
   double area = radius * radius * Math.PI;
   
   double volume = area * length; 
   
   System.out.println("The area is" + " " + area + ".");
   System.out.println("The volume is" + " " + volume + ".");
   }
}