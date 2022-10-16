public class BankAccount 
{
   private String password;
   private double balance;
   private String name;
   
   //Empty Constructor Sets password to null and balance to 0.0;
   public BankAccount()
   {
      password = null;
      balance = 0.0;
      name = null;
   }
   
   //Two parameter constructor sets password and balance
   public BankAccount(String pw, double bal, String newName)
   {
      password = pw;
      balance = bal;
      name = newName;
   }
   
   //deposit adds money to the balance
   public void deposit(double depositAmount)
   {
     balance = balance + depositAmount;
   }
   
   //withdrawal subtracts from the balance
   public void withdrawal(double withdrawalAmount)
   { 
      balance = balance - withdrawalAmount;
   }
   
   public void setName(String nameSet)
   {
      name = nameSet;
   }
   
   public void setPassword(String newPassword)
   {
      password = newPassword;
      
   }
   
   //print Name and balance
   public void printAccountInfo()
   {
      System.out.println(name + ":" + balance);
   }
   
   //make a toString method instead
   public String toString()
   {
       return name + ":" + balance;
   }
 }