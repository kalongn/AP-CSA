import java.util.Scanner;

public class increment
{
  public static void main(String[] args) 
  {
   int ogdigit;
   int num1;
   int num2;
   int num3;
   int num4;
   int num5;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Please enter a 5 Digit number: ");
   ogdigit = scan.nextInt();
   
   num1 = ogdigit / 10000 + 1;
   num1 = num1 % 10;
   
   num2 = (ogdigit / 1000) % 10 + 1;
   num2 = num2 % 10;
   
   num3 = (ogdigit / 100) %10 + 1;
   num3 = num3 % 10;
   
   num4 = (ogdigit / 10) % 10 + 1;
   num4 = num4 % 10;
   
   num5 = ogdigit % 10 + 1;
   num5 = num5 % 10;
   
   
   
   System.out.print("Here is the new digit: " + num1 + num2 + num3 + num4 + num5);
   
   }
 }
   
   

   
