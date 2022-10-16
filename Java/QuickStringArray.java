public class QuickStringArray 
{
  public static void main(String[] args) 
  {
     String[] array = {"to", "be", "or", "not", "to", "no", "holy"};
     String yes = "";
     if(array[array.length-1].equals("hamlet")||array.length%2 == 1)
     {
         for(int i = 0; i< array.length-2; i = i+2)
         {
            yes = array[i];
            array[i] = array[i+1];
            array[i+1] = yes;
          }
      }
      else if(array.length%2==0)
      {
         for(int i = 0; i< array.length; i = i+2)
         {
            yes = array[i];
            array[i] = array[i+1];
            array[i+1] = yes;
          }
       }
       for(String no : array)
       {
         System.out.print(no + " ");
       }
   }
}
