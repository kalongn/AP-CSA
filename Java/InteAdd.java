import java.util.Scanner;

public class InteAdd
{
   public static void main(String[] args)
   {
      int sum = 0;
      
      System.out.println("Enter an Integer (if number = 0, the code end and add all the numbers together)");
      Scanner temp = new Scanner(System.in);
      int number = temp.nextInt();
      
      while(number != 0)
      {
         sum = sum + number;
         System.out.println("Enter an Integer (if number = 0, the code end and add all the numbers together)");
         temp = new Scanner(System.in);
         number = temp.nextInt();
      }
      System.out.println("The sum of all previous value are " + sum);
    }
}  