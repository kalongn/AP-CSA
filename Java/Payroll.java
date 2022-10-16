public class Payroll
{
   private int[] itemsSold; // number of items sold by each employee
   private double[] wages; // wages to be computed in part (b)
 
   /** Returns the bonus threshold as described in part (a).
   */
   public Payroll(int[] itemsSold)
   {
      this.itemsSold = itemsSold;
      this.wages = new double[this.itemsSold.length];
   }
   
   public int getitemsSold(int index)
   {
      return this.itemsSold[index];
   }
   
   public double getWages(int index)
   {
      return this.wages[index];
   }
   
   public double computeBonusThreshold()
   {
      int sum = 0, min = getitemsSold(0) /*itemsSold[0]*/, max = getitemsSold(0);
      for(int i = 1; i< itemsSold.length; i++)
      {
        if(getitemsSold(i)<min)
        {
           min = getitemsSold(i);
        }
        if(getitemsSold(i)>max)
        {
           max = getitemsSold(i);
        }
      }
      for(int j : itemsSold)
      {
         sum = sum + j;
      }
      return (double)(sum - max - min)/ (itemsSold.length-2);     
   }
 
   /** Computes employee wages as described in part (b)
   * and stores them in wages.
   * The parameter fixedWage represents the fixed amount each employee
   * is paid per day.
   * The parameter perItemWage represents the amount each employee
   * is paid per item sold.
   */
   public void computeWages(double fixedWage, double perItemWage)
   {
      for(int i = 0; i<itemsSold.length; i++)
      {
         if(getitemsSold(i) > computeBonusThreshold())
         {
            wages[i] = (fixedWage + getitemsSold(i)*perItemWage)*1.1;
         }
         else
         {
            wages[i] = (fixedWage + getitemsSold(i)*perItemWage);
         }
      }
   }
   
   public String toString()
   {
      String yes = "";
      for(int i = 0; i< wages.length; i++)
      {
        yes = "" + yes + i + " : " + wages[i] + "\n";
      }
      return yes;
   }
   // Other instance variables, constructors, and methods not shown.
}