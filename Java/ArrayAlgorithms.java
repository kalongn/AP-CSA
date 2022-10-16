import java.util.ArrayList;

public class ArrayAlgorithms
{
  public static int findMax(int[] array)
  {
    int max = array[0];
    for(int i = 1; i< array.length; i++)
    {
      if(array[i]>max)
      {
         max = array[i];
      }
    }
    return max;
  }
 
  public static int findMin(int[] array)
  {
    int min = array[0];
    for(int i = 1; i< array.length; i++)
    {
      if(array[i]<min)
      {
         min = array[i];
      }
    }
    return min;
  }
  
  public static String print(int[] array)
  {
    String yes = "";
    for( int i : array)
    {
      yes = yes + " " + i;
    }
    return yes;
  }
  
  public static int sum(int[] array)
  {
    int sum = 0;
    for( int i : array)
    {
       sum = sum + i;
    }
    return sum;
  }
  
  public static int average(int[] array)
  {
    int average = sum(array)/array.length;
    return average;
  }
  
  public static int mode(int[] array)
  {
     int maxV = 0, maxC = 0;
     for( int i : array)
     {
       int count = 0;
       for( int j : array)
       {
         if(i == j)
         {
            count++;
          }
        }
        if( count > maxC)
        {
          maxC = count;
          maxV = i;
        }
      }
      return maxV;
    }
    
   private static int[] ArrayListToArray(ArrayList<Integer> integers)
   {
      int[] ints = new int[integers.size()];
      int i = 0;
      for (Integer n : integers)
      {
        ints[i++] = n;
      }
      return ints;
   }
    
   public static int[] modes(int array[])
   {
      ArrayList<Integer> modes = new ArrayList<Integer>();
      int maxCount = 0;   
      for (int i = 0; i < array.length; ++i)
      {
        int count = 0;
        for (int j = 0; j < array.length; ++j)
        {
          if (array[j] == array[i])
          {
            count++;
          }
        }
        if (count > maxCount)
        {
          maxCount = count;
          modes.add(array[i]);
        }
        else if ((count < maxCount) && (count > 1) && (!(modes.contains(array[i]))))
        {
          modes.add(array[i]);
        }
      }
      return ArrayListToArray(modes);
   }

    
    public static int search(int[] array, int value)
    {
      int index = 0;
      for( int i = 0; i < array.length; i++)
      {
         if(array[i] == value)
         {
            index = i;
         }
       }
       return index;
     }
     
     public static boolean checkPer(int [] array)
     {
         boolean test = false;
         double sq = 0.0;
         for(int i = 0; i < array.length; i++)
         {
            sq =(double)(Math.sqrt(array[i]));
            if((sq - Math.floor(sq))==0)
            {
               return true;
            }
          }
          return false;
      }
      
      public static int checkVPer(int [] array)
      {
         int test = 0;
         double sq = 0.0;
         for(int i = 0; i < array.length; i++)
         {
            sq =(double)(Math.sqrt(array[i]));
            if((sq - Math.floor(sq))==0 && array[i]!= 0)
            {
               test++;
            }
          }
          return test;
       }
       
       public static String consecutive( int [] array)
       {
         String no = "";
         for(int i = 0; i < array.length-1; i++)
         {
            if(array[i] + 1 == array[i+1])
            {
               no = no + " " + array[i] + "," + array[i+1];
            }
         }
         return no; 
       }
       
       public static boolean duplicate(int [] array)
       {
         for(int i : array)
         {
            int test = 0;
            for(int j : array)
            {
               if(i==j)
               {
                  test++;
                  if(test > 1)
                  {
                     return true;
                  }
               }
            }
          }
          return false;
        }
        
        public static int biggerThenTen(int[] array)
        {
            int count = 0;
            for(int i : array)
            {
              if(i>10)
              {
                 count++;
              }
            }
            return count;
         }
         
         public static int[] shiftLeft(int[] array)
         {
            int yes = array[0];
            for(int i = 1; i < array.length; i++)
            {
               array[i-1]=array[i];
            }
            array[array.length-1] = yes;
            return array;
          }
          
          public static int[] reverse(int[] array)
          {
            int yes = 0;
            for(int i = 0; i < array.length/2; i++)
            {
               yes = array[i];
               array[i] = array[array.length-1-i];
               array[array.length-1-i] = yes;
            }
            return array;
          } 
     
}