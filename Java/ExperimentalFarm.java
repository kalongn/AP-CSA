public class ExperimentalFarm
{
   private Plot[][] farmPlots;

   public ExperimentalFarm(Plot[][] p)
   {
      this.farmPlots = p;
   } 

   /** Returns the plot with the highest yield for a given crop type, as described in part (a). 
   *@ param c is not null
   */
   public Plot getHighestYield(String c)
   {
      int highest = 0;
      int highestRoleIndex = 0;
      int highestColumnIndex = 0;
      for(int i = 0; i < farmPlots.length; i++)
      {
         for(int j = 0; j < farmPlots[0].length; j++)
         {
            if(farmPlots[i][j].getCropType().equals(c))
            {
               if(farmPlots[i][j].getCropYield() > highest)
               {
                  highest = farmPlots[i][j].getCropYield();
                  highestRoleIndex = i;
                  highestColumnIndex = j;
               }
            }
         }
      }
      if(highest == 0)
      {
         return null;
      }
      return farmPlots[highestRoleIndex][highestColumnIndex];
   }

   /** Returns true if all plots in a given column in the two-dimensional array farmPlots
   * contain the same type of crop, or false otherwise, as described in part (b).
   * @param col is not null
   */
   public boolean sameCrop(int col)
   {
      int total = 0;
      String firstElement = farmPlots[0][col].getCropType();
      for(int i = 1; i < farmPlots.length; i++)
      {
         if(farmPlots[i][col].getCropType().equals(firstElement))
         {
            total++;
         }
      }
      if(total == farmPlots.length-1)
      {
         return true;
      }
      return false;
   }
   
   /**
   * toString method for ExperimentalFarm class
   */
   public String toString()
   {
      String temp = "";
      for(Plot[] i : farmPlots)
      {
         for(Plot j : i)
         {
            temp += j + ", ";
         }
         temp += "\n";
      }
      return temp;
   } 
}