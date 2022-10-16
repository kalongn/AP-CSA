import java.util.*;
public class WordScrambleTest  {
  public static void main(String[] args)
   {
      String[] wordArray = {"TAN", "ABRACADABRA", "WHOA", "AARDVARDK","EGGS","A",""};
      ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
      System.out.println("Testing scramble: ");
      for (String s: wordList)
      {
         System.out.println("Scramble of "+s+" is "+WordScramble.scrambleWord(s));
      }
      System.out.println("wordList before scrambleOrRemove "+wordList);
      WordScramble.scrambleOrRemove(wordList);
      System.out.println("wordList after scrambleOrRemove "+wordList);

   }

}