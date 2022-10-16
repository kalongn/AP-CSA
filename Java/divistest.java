public class divistest
{
  public static void main(String[] args)
  {
    int[] testAr = {2,4,6,8,10,1,3,5,7,9};
    //Should give 30!
    System.out.println("divBySum(testAr,2) = "+divBySum(testAr,2));
    //Should give 18
    System.out.println("divBySum(testAr,2) = "+divBySum(testAr,3));
  }
  /** Returns the sum of all integers in arr that 
    * are divisible by num Precondition: num > 0
    */


   public static int divBySum(int[] arr, int num)
   {
      int sum = 0;
      for(int i: arr)
      {
         if(i%num==0)
         {
            sum = sum+i;
         }
      }
      return sum;
   }
}