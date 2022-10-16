public class Cat
{
   private String catName;
   private int catValue;
   
   public Cat(String name, int value)
   {
      catName = name;
      catValue = value;
   }
   
   public String getCatName()          
   {
      return catName;
   }
   public int getCatValue()            
   {
      return catValue;
   }
   
   public void setCatValue(int value)  
   {
      catValue = value;
   }
   
   public String toString()
   {
      return catName + ": " + catValue;
   }
}