public class APLineRunner
{
   public static void main(String[] args)
   {
      //testing for APLine class
      APLine line1 = new APLine(5, 4, -17);
      double slope1 = line1.getSlope();
      boolean onLine1 = line1.isOnLine(5, -2);
      System.out.println(line1);
      System.out.println("line 1 slope is: " + slope1);
      System.out.println("is x = 5 and y = -2 on line1: " + onLine1);
      
      APLine line2 = new APLine(-25, 40, 30);
      double slope2 = line2.getSlope();
      boolean onLine2 = line2.isOnLine(5, -2);
      System.out.println(line2);
      System.out.println("line 2 slope is: " + slope2);
      System.out.println("is x = 5 and y = -2 on line2: " + onLine2);
    }
}     