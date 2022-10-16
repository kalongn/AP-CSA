import java.util.*;

public class removeEvenLengthClass
{
   public static void removeEvenLength (ArrayList<String> wordList)
   {
      for(int i = wordList.size(); i>0 ; i--)
      {
         if(wordList.get(i-1).length()%2==0)
         {
            wordList.remove(i-1);
         }
      }
    }
    
   public static void main(String[] args)
   {
      String[] wordArray = {"proof", "a", "can", "everything", "slylsy", "you", "invisible", "myths", "gypsy", "picnic"};
      ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
      System.out.println("before: " + wordList);
      removeEvenLength(wordList);
      System.out.println("after: " + wordList);
   }
}         
         