public class kilo_meters_perhour{

   public static void main(String[] args){
   
        double seconds = (60.0 * 100.0) + 35.0;
        
        double mph = 24.0 * 3600.0  / seconds;
        
        double kmh = mph * 1.6;
        
        System.out.println("kmh is" + kmh );
        
        }}