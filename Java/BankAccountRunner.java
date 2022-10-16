public class BankAccountRunner
{
  public static void main(String[] args)
  {
    //Create four accounts
    BankAccount a1 = new BankAccount("1234" , 10.1 , "P1");
    BankAccount a2 = new BankAccount("1234" , 12.2 , "P2");
    BankAccount a3 = new BankAccount("1234" , 13.3 , "P3");
    BankAccount a4 = new BankAccount("1234" , 14.4 , "P4");    
    //print out the account info for each customer
    a1.printAccountInfo();
    a2.printAccountInfo();
    a3.printAccountInfo();
    a4.printAccountInfo();
        
    //add to the balance of two of the customers
    a1.deposit(10);
    a2.deposit(20);
    
    //check their new balance
    a1.printAccountInfo();
    a2.printAccountInfo();
    
    //withdraw money from two of the accounts
    a3.withdrawal(3);
    a4.withdrawal(5);
    
    //check the new balance
    a3.printAccountInfo();
    a4.printAccountInfo();
    
    //update the name to a customer and check the new name.
    a1.setName("Player1");
    a2.setName("Player2");
    a3.setName("Player3");
    a4.setName("Player4");  
      
    //test out the toString() method
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(a4);
    
   }

  
  }