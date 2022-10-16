import java.util.ArrayList;
public class UserName
{
   // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
   private ArrayList<String> possibleNames;
   
   /** Constructs a UserName object as described in part (a).
    * Precondition: firstName and lastName have length greater than 0   
    * and contain only uppercase and lowercase letters.
    */
   public UserName(String firstName, String lastName)
   {
      String nameCombine = "";
      possibleNames = new ArrayList<String>();
      for(int i = 0; i < firstName.length(); i++)
      {
         nameCombine = lastName + firstName.substring(0,i+1);
         possibleNames.add(nameCombine);
      }
   }
     
   
   /** Returns true if arr contains name, and false otherwise. */
   public boolean isUsed(String name, String[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i].equals(name))
         {
            return true;
         }
      }
      return false;
   }
   
   /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
   public void setAvailableUserNames(String[] usedNames)
   {
      for(int i = 0; i < possibleNames.size(); i++)
      {
         for(String j : usedNames)
         {
            if(possibleNames.get(i).equals(j))
            {
               possibleNames.remove(i);
            }
         }
      }
   }
   
   /** gets contents of possibleNames */
   public ArrayList<String> getPossibleNames()
   {
      return this.possibleNames;
   }
   //put the method for that here...
   
   
   /* a toString() method to return all the values inside possibleNames*/
   public String toString()
   {
      String yes = "";
      for(String i : possibleNames)
      {
          yes += i + " , ";
      }
      return yes;
   }
}