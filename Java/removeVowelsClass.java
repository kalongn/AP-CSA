import java.util.*;

public class removeVowelsClass
{
   public static ArrayList removeVowels(ArrayList<String> wordList)
   {
      String temp = "";
      for(int i = 0; i< wordList.size(); i++)
      {
         temp = wordList.get(i);
         for(int j = 0; j < temp.length()-1; j++)
         {
            if(temp.substring(j,j+1).equals("a")|| 
               temp.substring(j,j+1).equals("e")||
               temp.substring(j,j+1).equals("i")||
               temp.substring(j,j+1).equals("o")||
               temp.substring(j,j+1).equals("u"))
            {
               temp = temp.substring(0,j) + temp.substring(j+1);
               j--;
            }
          }
          if(temp.substring(temp.length()-1).equals("a")||
             temp.substring(temp.length()-1).equals("e")||
             temp.substring(temp.length()-1).equals("i")||
             temp.substring(temp.length()-1).equals("o")||
             temp.substring(temp.length()-1).equals("u"))
          {
             temp = temp.substring(0,temp.length()-1);
          }
          wordList.set(i,temp);
        }
        return wordList;
    }
      
   public static void main(String[] args)
   {
      String[] wordArray = {"proof", "a", "can", "everything", "slyly", "you", "invisible", "myths", "gypsy", "picnic"};
      ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
      System.out.println("before: " + wordList);
      removeVowels(wordList);
      System.out.println("after: " + wordList);
   }
}         