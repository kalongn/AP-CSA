import java.util.Scanner;

public class TwoDArrayFirst
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the amount of row: ");
      int row = sc.nextInt();
      sc = new Scanner(System.in);
      System.out.println("Enter the amount of column: ");
      int column = sc.nextInt();
      int[][] numbers = new int[row][column];
      int sum = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         for(int j = 0; j < numbers[0].length; j++)
         {
            numbers[i][j] = (int)((Math.random()*10)+1);
         }
      }
      
      for(int i = 0; i < numbers.length; i++)
      {
         for(int j = 0; j < numbers[0].length; j++)
         {
            System.out.print(numbers[i][j] + ", ");
         }
         System.out.println();
      }
      System.out.println();
      
      for(int i = 0; i < numbers.length; i++)
      {
         for(int j = 0; j < numbers[0].length; j++)
         {
            sum += numbers[i][j]; 
         }
      }
      System.out.println("sum of the entire array: " + sum);
      
      sum = 0;
      
      for(int i = 0; i < numbers.length; i++)
      {
         for(int j = 0; j < numbers[0].length; j++)
         {
            sum += numbers[i][j]; 
         }
         System.out.println("sum of the each row of array: " + sum);
         sum = 0;
      }
      
      sum = 0;
      
      for(int i = 0; i < numbers[0].length; i++)
      {
         for(int j = 0; j < numbers.length; j++)
         {
            sum += numbers[j][i]; 
         }
         System.out.println("sum of the each column of array: " + sum);
         sum = 0;
      }
   }
}