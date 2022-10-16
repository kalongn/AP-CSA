public class customerRunner
{
   public static void main(String args[])
   {
      Customer c1 = new Customer("Jeremiah");
      System.out.println(c1.cusPay(50.05));
      System.out.println(Customer.nextAccR());
   }
}