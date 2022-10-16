public class Cow
{
   private String type, sound; 
   private int milk = 1;
   
   public Cow(String inputType, String inputSound)
   {
      type = inputType;
      sound = inputSound;
   }
   
   public String getSound()
   {
      return sound;
   }
   
   public String getType()
   {
      return type;
   }
   
   public int getMilk()
   {
      return milk;
   }
   
   public void milking()
   {
      milk++;
   }
   
}
      