public class Arrays2DDay2
{
   public static void main(String[] args)
   {
       //These represent scores of Test0, Test1, Test2 and Test3
       int[] student0 = {100, 85, 95, 96};
       int[] student1 = {99, 100, 100, 95};
       int[] student2 = {92, 100, 99, 100};
       int[] student3 = {100, 95, 97, 99};
       int[] student4 = {100, 100, 100, 70};
       int[] student5 = {100, 98, 99, 98};
       int[] student6 = {100, 95, 100, 93};
       
       //Declare a 2D array grades and use initializer lists to
       // fill its rows with student0, student1, ..., student6
       int[][] grade = {student0,student1,student2,student3,student4,student5,student6};
       
    }       
    //Write a static method getRowIndex(int value)
    static int[][] arr;
    
    public static int getRowIndex(int value)
    {
      for(int i = 0; i < arr.length; i++)
      {
         for(int j = 0; j < arr[0].length; j++)
         {
            if(value == arr[i][j])
            {
               return i;
            }
         }
      }
      return -1;
    }
    //Write a static method getColumnIndex(int value)
    public static int getColumnIndex(int value)
    {
      for(int i = 0; i < arr.length; i++)
      {
         for(int j = 0; j < arr[0].length; j++)
         {
            if(value == arr[i][j])
            {
               return j;
            }
         }
      }
      return -1;
    }
    //Write a static method getRow(int rowIndex) that returns the array 
    //at rowIndex
    public static int[] getRow(int index)
    {
      return arr[index];
    }
    //Write a static method getColumn(int index) that returns an 
    //array that represents the values at columnIndex
    public static int[] getColumn(int index)
    {
      int[] temp = new int[arr.length];
      for(int i = 0; i < arr.length;i++)
      {
         temp[i] = arr[i][index];
      }
      return temp;
    }       
}