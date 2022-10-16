import java.util.*;

public class BlackJackRunner
{
   public static void main(String[] args)
   {
      String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
      String[] SUITS = {"Heart", "Diamond", "Spades", "Clubs"};
      int[] POINT_VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
      Deck beginningDeck = new Deck(RANKS,SUITS,POINT_VALUES);
      Deck playerHands = new Deck();
      Deck ComputerHands = new Deck();
      System.out.println("It's a BlackJack game!");
      System.out.println("Only one deck is being used that is shuffled after each round");
      System.out.println("Computer stands on 17");
      System.out.println("A push results in a loss");
      System.out.println("If you or the computer get BlackJack, then that person will automatically win that round.");
      System.out.println("You lose the round if you go past 21.");
      System.out.println("An ace can only be worth 11 points \n");
      beginningDeck.shuffle();
      playerHands.addToTop(beginningDeck.deal());
      playerHands.addToTop(beginningDeck.deal());
      ComputerHands.addToTop(beginningDeck.deal());
      ComputerHands.addToTop(beginningDeck.deal());
      System.out.println("your hand \n" + playerHands);
      System.out.println("Do you want to Hit or Stand?");
      
   }
}