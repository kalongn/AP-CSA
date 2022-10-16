public class tempTest
{
   public static void printNums(int value, int numRounds)
   {
      for( int roundCounter = 0; roundCounter< numRounds; roundCounter++)
      {
         int tempV = value;
         for( int i = (int) ((Math.random()*9)+1); i != value; i = (int) ((Math.random()*9)+1))
         {
            System.out.print(i);
         }
         System.out.println(tempV);
      }
   }
   public static void main(String[] args)
   {
      int value = 6;
      int numRouds = 7;
      
      printNums(value,numRouds);
    }
}
   
