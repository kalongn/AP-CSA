import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int j = 0; j < ranks.length; j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
	}
  /**
   * Make a empty Deck.  Useful for using as a player's hand.
   */
  public Deck()
  {
     cards = new ArrayList<Card>();
  }
     
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return cards.size() == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return cards.size();
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		for (int k = cards.size() - 1; k > 0; k--) {
			int howMany = k + 1;			
			int randPos = (int) (Math.random() * howMany);
			Card temp = cards.get(k);
			cards.set(k, cards.get(randPos));
			cards.set(randPos, temp);
		}
	}
   

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
    *   This method uses the <code> remove </code> method from <code> ArrayList </code> 
	 */
	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		Card c = cards.remove(cards.size()-1);
		return c;
	}
   
   /**
    * Add a card to the <code> Deck </code>  on the top.
    * @param c the <code> Card </code> that you wish to add to the top of the deck of cards
    */
    public void addToTop(Card c)
    {
       cards.add(c);
    }
    /**
    * Add a card to the Deck on the bottom of the stack.
    * @param c the <code> Card </code> that you wish to add to the bottom of the deck of cards

    */
    public void addToBottom(Card c)
    {
       cards.add(0,c);
    }
    /**
    * Add a card to the Deck to the index of the stack.
    * @param c the <code> Card </code> that you wish to add to the index of the deck of cards

    */
    
    public void addToDeck(int index, Card c)
    {
      cards.add(index,c);
    }
    
    /* return the size of the deck
    */
    
    public int getCardCount()
    {
      return cards.size();
    }
    
    public Card getCard(int index)
    {
      return cards.get(index);
    }
    
    public int getCardTotal()
    {
      int total = 0;
      for(int i = 0; i < cards.size(); i++)
      {
         total += cards.get(i).pointValue();
      }
      return total;
    }
    

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	public String toString() {
		String rtn = "Listing "+cards.size()+" Cards in the Deck: \n";

		for (int k = cards.size() - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((cards.size() - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		
		rtn = rtn + "\n";
		return rtn;
	}
}
