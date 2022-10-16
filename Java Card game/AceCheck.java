import java.util.*;

public class AceCheck
{
   private boolean ace;// will set true if ace is in the player/computer deck
   private int indexOfAce;
   private int amountOfAce = 0;
   
   public int aceAmount()
   {
      return this.amountOfAce;
   }
   
   public void aceCheck(Deck deck)
   {
      int cards = deck.getCardCount();// number of cards in hand
      for(int i = 0; i < cards; i++)
      {
         if(deck.getCard(i).pointValue() == 1)
         {
            ace = true;
            indexOfAce = i;
            amountOfAce++;
         }
       }
    }
    
    public void aceSet(Deck deck)
    {
      
      if(ace == true && deck.getCardTotal() > 21)
      {
         deck.getCard(indexOfAce).changeAceValue();
      }
    }
}