import java.util.ArrayList;
import java.util.Arrays;
/** 
 * A class for managing the sorting algorithms of the AP Java A course
 */
public class SortUtil
{
  /**
   * Keeps track of the number of swaps
   */
  private static int swaps;
  /**
   * Keeps track of the number comparisons
   */
  private static int compares;
  /** 
   * Swap the two values at index i and j
   * @param al is  ArrayList of type Integer
   * @param i is an index of the ArrayList
   * @param j is an index of the ArrayList
   */
  public static int getSwaps()
  {
      return swaps;
  }
  public static void setSwaps(int swapSet)
  {
      swaps = swapSet;
  } 
  public static void swapsIncrease()
  {
      swaps++;
  }
  
  public static int getCompares()
  {
      return compares;
  }
  public static void setCompares(int comparesSet)
  {
      compares = comparesSet;
  } 
  public static void comparesIncrease()
  {
      compares++;
  }
  public static void swap(ArrayList<Integer> al, int i, int j)
  {
      Integer temp = al.get(i);
      al.set(i, al.get(j));
      al.set(j, temp); 
  }

  /**
   * Checks to see that the order of the ArrayList al is non-descending
   * @param al is an ArrayList of type Integer
   * @return true if the Integers are in non-descending order false otherwise
   */
  public static boolean isSorted(ArrayList<Integer> al)
  {
      for(int i = 0; i < al.size()-1; i++)
      {
         comparesIncrease();
         if(!(al.get(i) <= al.get(i+1)))
         {
            return false;
         }
      }
      return true;
  }
    
  
  /**
   * Creates an ArrayList of typpe Integer of length arrayLength with the range 0.0..maxVal
   * @param listLength the number of elements of the array
   * @param maxVal each element of the ArrayList has a value in the range 0..maxVal
   * @return an ArrayList of type Integer of length arrayLength
   */
  public static ArrayList<Integer> randomIntegerList(int listLength, Integer maxVal)
  {
     ArrayList<Integer> retAL = new ArrayList<>();
     for(int i = 0; i < listLength; i++)
     {
         Integer temp = (int)(Math.random()* (maxVal +1));
         retAL.add(temp);
     }
     return retAL;
  }
  
  /**
   * Checks that the ArrayLists have the same sum
   * (it's a simple way to check if our sort is working correctly)
   * @param a an ArrayList of type Integer
   * @param b an ArrayList of type Integer
   * @return true if they have the same sum false otherwise 
   * Precondition: a and b have the same length
   */
  public static boolean sameSum(ArrayList<Integer> a, ArrayList<Integer> b)
  {
      int sumA = 0;
      int sumB = 0;
      for(int i = 0; i < a.size(); i++)
      {
         sumA += a.get(i);
         sumB += b.get(i);
      }
      return sumA == sumB;
  }
   /**
   * Copy an ArrayList of type Integer.  To be used for checking the correctness sort
   * @param al an ArrayList of type Integer
   * @return an ArryList of type Integer that is a copy of al
   */
  public static ArrayList<Integer> copyIntegerList(ArrayList<Integer> al)
  {
     ArrayList<Integer> copyAL = new ArrayList<Integer>(al);
     return copyAL;
  }
  
  /**
  * Find the index of minimum value starting at the index index
  * @param index starting index of the search for the min
  * @param al an ArrayList of type Integer
  */
  public static int getMinIndex(ArrayList<Integer> al, int startInd)
  {
      int min = al.get(startInd);
      int minIndex = startInd;
      for(int i = startInd++; i < al.size(); i++)
      {
         comparesIncrease();
         if(al.get(i) < min)
         {
            min = al.get(i);
            minIndex = i;
         }
       }
       return minIndex;
  }
  
  /** Inserts the integer value into the list al.  Assumes the first stopIndex elements
     * are sorted.  
     * @param value - the value to be inserted
     * @param stopIndex - the first stopIndex elements are sorted
     * @param al the ArrayList of values.  Assume the values are sorted up to stopIndex
     */
  public static void insertValue(Integer value, int stopIndex, ArrayList<Integer> al)
  {
     for (int i = 0; i < stopIndex; i++)
     {
        comparesIncrease();
        if (value < al.get(i)) 
        {
           al.add(i,value);
           swapsIncrease();
           return;
        }
     }
     al.add(stopIndex,value);
  }
  
  /*public static void insertValueString(String test, int stopIndex, ArrayList<String> al)
  {
     for(int i = 0; i < stopIndex; i++)
     {
        if(test.compareTo(al.get(i))>0)
        {
            al.add(i,test);
            return;
        }
     }
     al.get(stopIndex);
   }*/
   
   public static void insertValueBinary(Integer value, int stopIndex, ArrayList<Integer> al)
   {
      int left = 0;
      int right = stopIndex;
      while (left < right)
      {  
          comparesIncrease();
          int middle = (left+right)/2;
          if (al.get(middle) < value)
          { //target is bigger look to the right
            left = middle +1 ;
          }
          else if (al.get(middle) > value)
          { //target is smaller 
             right = middle;
          }
          else
          { 
             swapsIncrease();
             al.add( middle, value );
             return;
          }
       }
       swapsIncrease();
       //left == right, so insert there!
       al.add(left,value);
     }
      
         
  public static void main(String[] args)
  {
     ArrayList<Integer> testAL = randomIntegerList(10,10);
     System.out.println("randomIntegerList(10,10) = "+testAL);
     ArrayList<Integer> copytestAL = copyIntegerList(testAL);
     swap(testAL, 3, 6);
     System.out.println("after swap between index 3 and 6 = "+testAL);
     System.out.println("smallest digit from index 4: " + getMinIndex(testAL, 4));
     System.out.println("is the ArrayList sorted? "+ isSorted(testAL));
     System.out.println("Copyied ArrayList "+ copytestAL);
     System.out.println("sum of 2 ArrayList equals? "+ sameSum(copytestAL,testAL));
     System.out.println("testing insertValue:");
     ArrayList<Integer> sortedAL = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
     System.out.println(sortedAL);
     insertValue(25, 5, sortedAL);
     System.out.println(sortedAL);
     insertValue(100, 3, sortedAL);
     System.out.println(sortedAL);
     System.out.println("testing insertValueString:");
     /*ArrayList<String> Stringal = new ArrayList<String>(Arrays.asList("A", "C", "B", "G", "E"));
     System.out.println(Stringal);
     insertValueString("B", 5, Stringal);
     System.out.println(Stringal);
     insertValueString("Z", 3, Stringal);
     System.out.println(Stringal);
     */
    /* System.out.println("isSorted gives "+isSorted(testAL));
     ArrayList<Integer> copyOfTestAL = copyIntegerList(testAL);*/
  }
}