public class SecretWord
{
  private String word;

  public SecretWord(String w)
  {
    word = w;
  }

  /**
  * Precondition: parameter num is less than the length of word.
  * Postcondition: Returns the string of the characters of word from
  *                index num to the end of word followed by the 
  *                characters of word from index 0 to num, not including
  *                index num.  The state of word is not changed.
  */
  public String newWord(int num)
  {
      return word.substring(num) + word.substring(0,num);
  }
}