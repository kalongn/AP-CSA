public class Plot
{
   private String cropType;
   private int cropYield;

   public Plot(String crop, int yield)
   {
      this.cropType = crop;
      this.cropYield = yield;
   } 

   /**
   * getter method for Plot class variable cropType
   */
   public String getCropType()
   {
      return cropType;
   }

   /**
   * getter method for Plot class variable cropYield
   */
   public int getCropYield()
   {
      return cropYield;
   }
   
   /**
   * toString method for Plot class
   */
   public String toString()
   {
      return this.cropType + " : " + this.cropYield;
   }
}