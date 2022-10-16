import java.util.Scanner;

public class Arraytest1
{
  public static void main(String[] args)
  {
      double sum = 0.0;
      double average = 0.0;
      
      System.out.println("please enter the amount of number: ");
      Scanner scan = new Scanner(System.in);
      int items = scan.nextInt();
      double[] numbers = new double[items];
      
      System.out.println("please enter the numbers: ");
      for(int i = 0; i < items; i++)
      {
         numbers[i] = scan.nextDouble();
         sum += numbers[i];
      }
      
      System.out.print("The numbers array: ");
      for(int i = 0; i < numbers.length; i++)
      {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
      
      System.out.println("This is the sum of all the number: " + sum);
      average = sum/items;
      System.out.println("This is the average: " + average);
      
      int aboveAvg = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         if(numbers[i] > average)
         {
            aboveAvg++;
         }
      }
      System.out.println("The amount of numbers that are above average: " + aboveAvg);         
   }
}
  
      
      
      