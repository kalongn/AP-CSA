/** Horse - a class that represents a horse with it's name and weight 
 * for the AP Java A exam from 2012
 */ 
public class Horse
{
  /** The name of the horse */ 
  private String name;
  /** The weight of the horse in pounds */
  private int weight;
  
  /** Construct the horse using name and weight
   * @param name a string that is the name of the horse 
   * @param weight an int that is the weight in pounds
   */
   public Horse(String name, int weight)
   {
     this.name = name;
     this.weight = weight; 
   }
   
   /** Get the weight
    * @return int the weight in pounds of the horse
    */
    public int getWeight()
    {
        return this.weight;
    }
    
    /** Get the name
     * @return String that represents the name of the horse
     */
     public String getName()
     {
         return this.name;
     }
     /** Returns a String with the name and the weight separated by a colon.
      *  @return String in the form name : weight 
      */
      public String toString()
      {
         return this.name + " : " + this.weight; 
      }
 }
