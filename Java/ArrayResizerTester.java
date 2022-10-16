public class ArrayResizerTester
{
  public static void main(String[] args)
  {
    System.out.println("---- TESTING PART A ----");
    int[][] arr = {{2, 1, 0},
                   {1, 3, 2},
                   {0, 0, 0},
                   {4, 5, 6}};
    System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
    
    System.out.println("\n---- TESTING PART B ----");
    int[][] arr2 = {{2, 1, 0},
                    {1, 3, 2},
                    {0, 0, 0},
                    {4, 5, 6}};
    int[][] smaller = ArrayResizer.resize(arr2); 
    
    System.out.println("contents of 'smaller' 2D array:");            
    for (int[] row : smaller)
    {
      for (int element : row)
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    
    System.out.println("\noriginal 2D array is NOT modified:");            
    for (int[] row : arr2)
    {
      for (int element : row)
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}