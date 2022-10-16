import java.util.*;

public class SortAlgorithms
{
   public static ArrayList<Integer> bubbleSort(ArrayList<Integer> al)
   {
      int i = 0;
      while(SortUtil.isSorted(al) == false && i < al.size()-1)
      {
         for(int j = 0; j < al.size()-i-1; j++)
         {
            SortUtil.comparesIncrease();
            if(al.get(j) > al.get(j+1))
            {  
               SortUtil.swap(al, j, j+1);
               SortUtil.swapsIncrease();
            }
          }
          i++;
       }
       return al;
    }
    
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> al)
    {
      for(int i = 0; i < al.size(); i++)
      {
         int minInd = SortUtil.getMinIndex(al,i);
         SortUtil.swap(al, i, minInd);
         SortUtil.swapsIncrease();
      }
      return al;
    }
    
   public static void insertionSort(ArrayList<Integer> al)
   {
      for(int i = 1; i < al.size(); i++)
      {
         Integer value = al.remove(i);
         SortUtil.insertValue(value, i, al);
      }
   }
   
  public static void insertionSortBinary(ArrayList<Integer> al)
  {
     for (int i = 0; i < al.size(); i++)
     {
        SortUtil.swapsIncrease();
        Integer value = al.remove(i);
        SortUtil.insertValueBinary(value,i,al);
     }
  }
  
  public static void recursiveInsertionSort(ArrayList<Integer> al, int n)
  {
    if (n <= 1)
    {
      SortUtil.comparesIncrease();
      return;
    }
    recursiveInsertionSort(al, n-1);
    int last = al.get(n-1), j = n-2;

    while (j >= 0 && al.get(j) > last)
    {
      SortUtil.comparesIncrease();
      al.set(j+1, al.get(j));
      SortUtil.swapsIncrease();
      j--;
    }
    al.set(j+1, last);
    SortUtil.swapsIncrease();
  }
    
   public static void main(String[] args)
   {
      double startTime, endTime;
      ArrayList<Integer> testAL= null; 
      ArrayList<Integer> copyToSort = null; 
      
      /*for (int i = 50000; i <= 50000; i+=100) {
      System.out.println("i = "+i);
      testAL = SortUtil.randomIntegerList(i,i*100);
      copyToSort = SortUtil.copyIntegerList(testAL);
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      //System.out.println("before bubble sorting: "+copyToSort);
      System.out.println("bubble sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      startTime = System.currentTimeMillis();
      //System.out.print("start time = "+startTime);
      bubbleSort(copyToSort);
      endTime = System.currentTimeMillis();
      //System.out.print(" end time = "+endTime);
      System.out.println(" bubble sort time in milli seconds = "+(endTime-startTime));
      //System.out.println("after bubble sorting: "+copyToSort);
      System.out.println("bubble sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      System.out.println("isSorted (bubble sort): "+SortUtil.isSorted(copyToSort));
      System.out.println("Sum equal before and after (bubble sort): "+SortUtil.sameSum(testAL,copyToSort));
      System.out.println("=================");
      }
      
      for (int i = 50000; i <= 50000; i+=100) {
      System.out.println("i = "+i);
      testAL = SortUtil.randomIntegerList(i,i*100);
      copyToSort = SortUtil.copyIntegerList(testAL);
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      copyToSort = SortUtil.copyIntegerList(testAL);
      System.out.println("selection sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      //System.out.println("before selection sorting: "+copyToSort);
      startTime = System.currentTimeMillis();
      selectionSort(copyToSort);
      endTime = System.currentTimeMillis();
      //System.out.println("after selection sorting: "+copyToSort);
      System.out.println(" selectionSort time in milli seconds = "+(endTime-startTime));
      System.out.println("selection sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      System.out.println("isSorted: "+SortUtil.isSorted(copyToSort));
      System.out.println("Sum equal before and after (selection sort): "+SortUtil.sameSum(copyToSort,testAL));
      System.out.println("=================");
      }*/
      
      for (int i = 5000; i <= 5000; i+=100) {
      System.out.println("i = "+i);
      testAL = SortUtil.randomIntegerList(i,i*100);
      copyToSort = SortUtil.copyIntegerList(testAL);
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      copyToSort = SortUtil.copyIntegerList(testAL);
      System.out.println("insertion sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      //System.out.println("before insertion sorting: "+copyToSort);
      startTime = System.currentTimeMillis();
      insertionSort(copyToSort);
      endTime = System.currentTimeMillis();
      //System.out.println("after insertion sorting: "+copyToSort);
      System.out.println("insertionSort time in milli seconds = "+(endTime-startTime));
      System.out.println("insertion sort swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      System.out.println("isSorted: "+SortUtil.isSorted(copyToSort));
      System.out.println("Sum equal before and after: "+SortUtil.sameSum(copyToSort,testAL));
      System.out.println("=================");
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      }
      
      for (int i = 5000; i <= 5000; i+=100) {
      System.out.println("i = "+i);
      testAL = SortUtil.randomIntegerList(i,i*100);
      copyToSort = SortUtil.copyIntegerList(testAL);
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      startTime = System.currentTimeMillis();
      insertionSortBinary(copyToSort);
      endTime = System.currentTimeMillis();
      System.out.println("insertionSortBinary time in milli seconds = "+(endTime-startTime));
      System.out.println("binary insertion sorting swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      System.out.println("isSorted: "+SortUtil.isSorted(copyToSort));
      System.out.println("Sum equal before and after: "+SortUtil.sameSum(copyToSort,testAL));
      System.out.println("=================");
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      }
      
      for (int i = 5000; i <= 5000; i+=100) {
      System.out.println("i = "+i);
      testAL = SortUtil.randomIntegerList(i,i*100);
      copyToSort = SortUtil.copyIntegerList(testAL);
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      startTime = System.currentTimeMillis();
      recursiveInsertionSort(copyToSort, copyToSort.size());
      endTime = System.currentTimeMillis();
      System.out.println("recursiveInsertionSort time in milli seconds = "+(endTime-startTime));
      System.out.println("binary insertion sorting swaps = "+SortUtil.getSwaps()+" compares = "+SortUtil.getCompares());
      System.out.println("isSorted: "+SortUtil.isSorted(copyToSort));
      System.out.println("Sum equal before and after: "+SortUtil.sameSum(copyToSort,testAL));
      System.out.println("=================");
      SortUtil.setCompares(0);
      SortUtil.setSwaps(0);
      }
   }
}
   