public class Customer
{
   private static int nextAccNum = 1;
   private String name;
   private int currAccNum;

   public Customer(String n)
   {
      name = n;
      currAccNum = nextAccNum;
      nextAccNum++;
   }
   
   public String cusPay(double money)
   {
      return name + ", account number " + currAccNum +  ", please pay $" + money;
   }
   
   public static int nextAccR()
   {
      return nextAccNum;
   }
   
   public void updateName(String updateName)
   {
      name = updateName;
   }

}