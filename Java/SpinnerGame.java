//Ka Long Ngai AP Java Period 3
public class SpinnerGame
{
   /** Precondition: min < max
   * Simulates a spin of a spinner by returning a random integer
   * between min and max, inclusive.
   */
   private int maxv = 0;
   private int minv = 0;
   int score = 0;
   
   /*public void Setter(int min, int max)
   {
      if(min>max)
      {
         System.out.print("Sorry but min is not less that max please retry");
         System.exit(0);
      }
      minv = min;
      maxv = max;
   }*/
   
   public int spin(int min, int max)
   {
      if(min>max)
      {
         System.out.print("Sorry but min is not less that max please retry");
         System.exit(0);
      }
      minv = min;
      maxv = max;
      return (int)((Math.random()*(max))+min);
   }
 
   /** Simulates one round of the game as described in part (b).
   */
   public void playRound()
   {
      int playerScore = spin(1,10);
      System.out.println("Player number on first round is " + playerScore);
      int tempScore = playerScore;
      int computerScore = spin(2,8);
      System.out.println("Computer number on first round is " + computerScore);
      int tempScoreC = computerScore;
      
      if(playerScore == computerScore)
      {
         playerScore = spin(1,10);
         System.out.println("Player number on second round is " + playerScore);
         computerScore = spin(2,8);
         System.out.println("Computer number on second round is " + computerScore);
         if(playerScore == computerScore)
         {
            System.out.println("Tie. 0 points");
         }
         else if((playerScore+tempScore) > (computerScore+tempScoreC))
         {
            score = playerScore - computerScore;
            System.out.println("You win! " + score + " ahead");
         }
         else
         {
            score = (playerScore + tempScore) - (computerScore + tempScoreC);
            System.out.println("You lose! " + score + " behind");
         }
      }
      else if(playerScore > computerScore)
      {
         score = playerScore - computerScore;
         System.out.println("You win! " + score + " ahead");
      }
      else
      {
         score = playerScore - computerScore;
         System.out.println("You lose! " + score + " behind");
      }
         
   }
}
