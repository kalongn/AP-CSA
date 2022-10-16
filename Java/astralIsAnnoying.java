public class astralIsAnnoying
{
   public static void main(String[] args)
   {
      int number = 983457903, reversedNumber = 0;
      System.out.println(number);
      
      while(number!= 0)
      {
         int singleDigit = number%10;
         reversedNumber = reversedNumber*10 + singleDigit;
         number = number/10;
      }
      
      System.out.print(reversedNumber);
   }
}         