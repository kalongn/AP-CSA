//import all the stuff with
import java.util.*;
public class WordScramble
{
   public static String scrambleWord(String word)
   {
      String returnString = "";
      int i = 0;
      for(i = 0; i < word.length()-1; i++)
      {
         if(!(word.substring(i,i+1).equals("A") && !(word.substring(i+1,i+2).equals("A"))))
         {
            returnString = returnString + word.substring(i,i+1);   
         }
         else
         {
            returnString = returnString + word.substring(i+1,i+2) + word.substring(i, i+1);
            i++;
         }
      }
      if(i<word.length())
      {
         returnString += word.substring(i);
      }
      return returnString;
   }
   
   public static void scrambleOrRemove(ArrayList<String> wordList)
   {
      String temp = "";
      String scramble = "";
      for(int i = 0; i < wordList.size(); i++)
      {
         temp = wordList.get(i);
         scramble = scrambleWord(temp);
         if(temp.equals(scramble))
         {
            wordList.remove(i);
         }
         else
         {
            wordList.set(i,scramble);
         }
       }
   }
}