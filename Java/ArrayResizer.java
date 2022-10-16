public class ArrayResizer
{
  /** Returns true if and only if every value in row r of array2D is non-zero.
    * Precondition: r is a valid row index in array2D.
    * Postcondition: array2D is unchanged.
    */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  {
	   boolean checker = true;
	   for(int i = 0; i < array2D[0].length; i++)
	   {
	   	if(array2D[r][i] == 0)
	   	{
	   		checker = false;
	   	}
	   }
	   return checker;
  }
  
  /** Returns the number of rows in array2D that contain all non-zero values.
    * Postcondition: array2D is unchanged.
    */
  public static int numNonZeroRows(int[][] array2D)
  {
    // THE CODE FOR THIS METHOD WAS WRITTEN TO ENABLE TESTING
    // (but on exam, this method is "implementation not shown")
    int count = 0;
    for (int[] row : array2D)
    {
      boolean nonZeroRow = true;
      for (int element : row)
      {
        if (element == 0)
        {
          nonZeroRow = false;
        }
      }
      if (nonZeroRow)
      {
        count++;
      }
    }
    return count;
  }

  
  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
    * from array2D with no zeros, as described in part (b).
    * Precondition: array2D contains at least one column and at least one row with no zeros.
    * Postcondition: array2D is unchanged.
    */
  public static int[][] resize(int[][] array2D)
  {
	   int rowLength = numNonZeroRows(array2D);
	   int columnLength = array2D[0].length;
	   int[][] returnArray = new int[rowLength][columnLength];
      int test = 0;
	   for(int i = 0; i < array2D.length; i++)
	   {
	   	if(isNonZeroRow(array2D,i))
	   	{
	   		returnArray[test] = array2D[i];
            test++;
	   	}
	   }
	   return returnArray;
  }
}