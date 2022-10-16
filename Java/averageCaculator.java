import java.util.Scanner;

public class averageCaculator
{
  public static void main(String[] args) 
  {
   String name;
   double num1;
   double num2;
   double num3;
   double average;
   
   Scanner scan = new Scanner(System.in);
   
   
   System.out.print("Please enter your name: ");
   name = scan.nextLine();
   
   System.out.print("Please enter the first number: ");
   num1 = scan.nextDouble();
   
   System.out.print("Please enter the second number: ");
   num2 = scan.nextDouble();
   
   System.out.print("Please enter the third number: ");
   num3 = scan.nextDouble();
   
   average = (num1 + num2 + num3) / 3;
   
   System.out.print("Hello " + name + "This is the average: " + String.format("%.02f", average));
   }
}
  
