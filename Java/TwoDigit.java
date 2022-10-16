import java.util.Scanner;

public class TwoDigit
{
   public static void main(String[] args)
   {
      //generation of lottery number
      int money;
      int lottery = (int)(Math.random() * 100);
      //debug user only
      //System.out.println("the lottery number is: " + lottery);
      //user promt
      System.out.print("Enter a number between 0-100 number: ");
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      //get Lottery number
      int firstLot = lottery/10;
      int secondLot = lottery%10;
      //get the number out of the the promt
      int firstDigit = (number/10);
      int secondDigit = number%10;
      //the part to decide if number are worth 3 and 0 dollars
      if(lottery==number)
      {
         money = 10;
         System.out.println("you win " + money + " dollars!!");
         System.out.println("the lottery number is: " + lottery);
      }
      else if((firstLot==secondDigit)&&(secondLot==firstDigit))
      {
         money = 3;
         System.out.println("you win " + money + " dollars!!");
         System.out.println("the lottery number is: " + lottery);
      }
      else if((firstLot==secondDigit) || (secondLot==firstDigit) || (firstLot==firstDigit) || (secondLot==secondDigit))
      {
         money = 1;
         System.out.println("you win " + money + " dollars!!");
         System.out.println("the lottery number is: " + lottery);
      }
      else
      {
         money = 0;
         System.out.println("you win fresh air and no " + money + " dollars!!");
         System.out.println("the lottery number is: " + lottery);
      }
      //I notice that random can get a single number digit.
   }
}


   
