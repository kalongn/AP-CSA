public class PayrollRunner
{
   public static void main(String[] args) 
   {
      //testing for payroll
      int[] ar = {48,50,37,62,38,70,55,37,64,60};
      Payroll test = new Payroll(ar);
      double Threshold = test.computeBonusThreshold();
      test.computeWages(10.0,1.5);
      System.out.println("Bonus Threshold: " + Threshold);
      System.out.print(test);
   }
}