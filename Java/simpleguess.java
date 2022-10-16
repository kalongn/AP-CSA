import java.util.Scanner;

public class simpleguess
{
   public static void main(String[] args)
   {
      int answer = (int)(Math.random()*100);
      System.out.println(answer);
      
      System.out.println("Guess a number between 0-100 \n");
      Scanner temp = new Scanner(System.in);
      int number = temp.nextInt();
      
      while(answer != number)
      {
         if(number > answer)
         {
            System.out.println("Wrong guess, it is too big. Guess again? \n");
            temp = new Scanner(System.in);
            number = temp.nextInt();
         }
         else
         {
            System.out.println("Wrong guess, it is too small. Guess again? \n");
            temp = new Scanner(System.in);
            number = temp.nextInt();
         }      
      }
      System.out.println("You guesed it");
    }
}  

