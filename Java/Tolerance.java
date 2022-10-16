import java.util.Arrays;
import java.util.ArrayList;

public class Tolerance
{
  public static void main(String[] args)
   {
      Double[] doubleArray = {0.0101, 0.05008, 0.03008, 0.0703, 0.0104, 0.09123};
      ArrayList<Double> doubleAL = new ArrayList<>(Arrays.asList(doubleArray));
      //find the index of 0.07 - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
      System.out.println(findDouble(0.07,doubleAL,0.001));
      ////find the index of 0.02 - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
     System.out.println(findDouble(0.02,doubleAL,0.001));

   }
   
   public static int findDouble(double target, ArrayList<Double> doubleAL, double tolerance)
   {
     for(int i = doubleAL.size(); i >0; i--)
     {
         if(Math.abs(doubleAL.get(i-1)-target) <= tolerance)
         {
            return i-1;
         }
     }
     return -1; 
   }
}