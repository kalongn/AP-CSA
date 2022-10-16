import java.util.Scanner;

public class Squareroot
{
   
   public static boolean checknum(double num)
   {
     double sq = Math.sqrt(num);
     return ((sq-Math.floor(sq)) == 0);
   }
   
   public static void main(String[] args)
   {
      System.out.print("Enter a number: ");
      Scanner scanner = new Scanner(System.in);
      double number = scanner.nextDouble();
      scanner.close();
      
      if (checknum(number))
         System.out.print(number + " is a perfect square number");
      else
         System.out.print(number + " is not a perfect sqaure number");
      
   }
}
      