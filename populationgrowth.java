public class populationgrowth{
   public static void main(String [] args){
   
   int time = (3600*24*365);
   int current_population = 312032486;
   int birth = time/7;
   int death = time/13;
   int immigrant = time/45;
   int population =  birth + immigrant - death; 
   
   for(int i = 1; i <= 5; i++){
   
   current_population = current_population + population;
   System.out.println(i + "year population is " + current_population);
   }
   
      
   
   
   }}