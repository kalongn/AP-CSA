import java.util.*;

public class BinarySearch {
public static void main(String[] args)
   {
      Double[] doubleArray = {0.0101, 0.01008, 0.03, 0.0302, 0.03008, 0.04009, 0.07, 0.0703, 0.09, 0.1104, 0.191, 0.2, 0.322, 0.33, 0.4, 0.5};
      ArrayList<Double> doubleAL = new ArrayList<>(Arrays.asList(doubleArray));
      //use a binary search to find the index of 0.191 (should get 10)
      // - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
      System.out.println(binarySearchDouble(0.191,doubleAL,0.001));
      //use a binary search find the index of 0.02 (should get -1)
      // - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
     System.out.println(binarySearchDouble(0.02,doubleAL,0.001));

   }
   
   public static int binarySearchDouble(double target, ArrayList<Double> doubleAL, double tolerance)
   {
      int left = 0;
      int right = doubleAL.size()-1;
      int middle = 0;
      while(left <= right)
      {
         middle = (left+right)/2;
         if(Math.abs(doubleAL.get(middle)-target) <= tolerance)
         {
            return middle;
         }
         else if(target < doubleAL.get(middle))
         {
            right = middle -1;
         }
         else if(target > doubleAL.get(middle))
         {
            left = middle +1;
         } 
      }  
      return -1;     
   }
}