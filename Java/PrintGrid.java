public class PrintGrid
{
  public static void main(String[] args)
  {
     String[][] grid = {{"A","B","C","D","E"},
                        {"F","G","H","I","J"},
                        {"K","L","M","N","O"},
                        {"P","Q","R","S","T"}};
                        
     for(int i = 0; i < grid.length; i++)
      {
         for(int j = 0; j < grid[0].length; j++)
         {
            System.out.print(grid[i][j] + ", ");
         }
         System.out.println();
      }
      System.out.println();
      
      for(String[] i : grid)
      {
         for(String j : i)
         {
            System.out.print(j + ", ");
         }
         System.out.println();
      }
      System.out.println();
      
      for(String[] i : grid)
      {
         for(String j : i)
         {
            System.out.print(j + ", ");
         }
      }
      System.out.println("\n");
      
      for(int i = 0; i < grid[0].length; i++)
      {
         for(int j = 0; j < grid.length; j++)
         {
            System.out.print(grid[j][i] + ", ");
         }
      }
      System.out.println("\n");
      
      int temp = 0;
      while(temp != grid[0].length)
      {
         for(String[] i : grid)
         {
            System.out.print(i[temp] + ", ");
         }
         temp++;
      }
      System.out.println("\n"); 
  }   
}