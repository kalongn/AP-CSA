/** From the AP Java A 2012 Free Response Question - 
 * A good problem for practicing arrays of objects.
 */
import java.util.ArrayList;

public class HorseBarnTwo
{
   private ArrayList<Horse> spaces = null;

   /** Constructor that takes the number of stalls
    * @param numStalls - the number of stalls in the barn
    */
   public HorseBarnTwo(int numStalls)
   {
     this.spaces = new ArrayList<Horse>(numStalls);
     for(int i = 0; i < numStalls; i++)
     {
        spaces.add(null);
     }
   }
   /** Set space[i] to the reference Horse
    * precondition: spaces.length > i 
    */
    public void setSpaces(int i, Horse h)
    {
      if (spaces != null)
         this.spaces.set(i,h);
      else
        System.out.println("This space had been taken");
    }
   /** Returns the index of the space that contains the horse with the specified name.
    * * Precondition: No two horses in the barn have the same name.
    * @param name the name of the horse to find
    * @return the index of the space containing the horse with the specified name;
    * -1 if no horse with the specified name is in the barn.
    */
   public int findHorseSpace(String name)
   {
     for(int i = 0; i < spaces.size(); i++)
     {
        if(this.spaces.get(i) != null && this.spaces.get(i).getName().equals(name))
        {
          return i;
        }
     }
     return -1;
   }
   
    /** Consolidates the barn by moving horses so that the horses are
    *  in adjacent spaces, starting at index 0, with no empty space
    *  between any two horses.
    * Postcondition: The order of the horses is the same as before
    *  the consolidation.
    */
   public void consolidate()
   {
      for(int i = 0; i<this.spaces.size(); i++)
      {
         if(this.spaces.get(i) == null)
         {
            for(int j = i+1; j<this.spaces.size(); j++)
            {
               if(this.spaces.get(j) != null)
               {
                  this.spaces.set(i,this.spaces.get(j));
                  this.spaces.set(j,null);
                  j = this.spaces.size();
               }
            }
         }
      }
   }
   
   /** Returns a String that shows the contents of the spaces
     * array.  Keep in mind that Horse already has a toString.
     * @return a string that shows the contents of the array spaces.
     * prints null if the space is null.  Prints the horse info.
     */
   public String toString()
   {
     String result = "";
     for(int i = 0; i< spaces.size(); i++)
     {
        result = result + "" + spaces.get(i) + ", ";
     }
     return result;
   }

  public static void main(String[] args) 
  {
     HorseBarnTwo barn = new HorseBarnTwo(7);
     barn.setSpaces(0, new Horse("Trigger", 1340));
     barn.setSpaces(2, new Horse("Silver",1210));
     barn.setSpaces(3,  new Horse("Lady", 1575));
     barn.setSpaces(5, new Horse("Patches", 1350));
     barn.setSpaces(6, new Horse("Duke", 1410));

     // print out what is in the barn
     System.out.println(barn);

     // test
     System.out.println("Index of Trigger should be 0 and is " +
                        barn.findHorseSpace("Trigger"));
     System.out.println("Index of Silver should be 2 and is " +
                        barn.findHorseSpace("Silver"));
     System.out.println("Index of Coco should be -1 and is " +
                        barn.findHorseSpace("Coco"));
     //Testing consolidate
     barn.consolidate();
     System.out.println("After consolidate:");
     System.out.println(barn);
     
     //Example from part b 
     
     HorseBarnTwo barn2 = new HorseBarnTwo(7);
     barn2.setSpaces(0, new Horse("Trigger", 1340));
     barn2.setSpaces(2, new Horse("Silver",1210));
     barn2.setSpaces(5, new Horse("Patches", 1350));
     barn2.setSpaces(6, new Horse("Duke", 1410));
     
     System.out.println("before consolidate (of part b example)");
     System.out.println(barn2);
     barn2.consolidate();
     System.out.println("after consolidate (of part b example)");
     System.out.println(barn2);

  }
}