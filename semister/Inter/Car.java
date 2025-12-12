package semister.Inter;
public class Car implements Distance{
   @Override
  public void calculate(double x){
      System.out.println("Distance traveled by car: " + x + " km");
   }
     
}