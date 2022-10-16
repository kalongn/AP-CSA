import java.util.Scanner;

public class simplequiz
{
   public static void main(String[] args)
   {
      int first = (int)((Math.random()*10)+1);
      int second = (int)((Math.random()*10)+1);
      int answer = first +second;
      
      System.out.println("what is " + first + " + " + second + " ?\n");
      Scanner temp = new Scanner(System.in);
      int number = temp.nextInt();
      
      while(answer != number)
      {
         System.out.println("Wrong guess again? \n");
         temp = new Scanner(System.in);
         number = temp.nextInt();
      }
      System.out.println("You are correct");
    }
}  
      