import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListExamples
{
  public static void main(String[] args)
  {
     String[] stringA = { "word","random","repeat","repeat","last"};
     ArrayList<String> stringAL  = new ArrayList<>(Arrays.asList(stringA));
     System.out.println(stringAL);
     //Example of enhanced for loop:
     String wholeString = "";
     for (String s:stringAL)
     {
        wholeString += s;
     }
     System.out.println(wholeString);
     //Don't use .remove with enhanced for loop!
     for (int i = 0; i < stringAL.size(); i++)
     {
        String s = stringAL.get(i);
        if (s.equals("word"))
        { 
           stringAL.remove(s);
        }
     }
     System.out.println(stringAL);

     //Be careful with removing especially if there are repeats!
     for (int i = 0; i < stringAL.size(); i++)
     {
        String s = stringAL.get(i);
        if (s.equals("repeat"))
        { 
           stringAL.remove(s);
           //it removes and shifts everything over,
           //so the next repeat gets skipped!
           i--;
        }
     }
     System.out.println(stringAL);
     
     //Be careful with removing especially if there are repeats!
     for (int i = 0; i < stringAL.size(); i++)
     {
        String s = stringAL.get(i);
        if (s.equals("last"))
        { 
           stringAL.remove(s);
        }
     }
     System.out.println(stringAL);

  }
}