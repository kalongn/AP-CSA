public class TimeRunner
{
  public static void main(String[] args)
  {
  
  Time o1 = new Time( 6 , 59 , 59);
  Time o2 = new Time( 17, 45, 59);
  Time o3 = new Time( 15, 12, 54);
  
  o1.printTime();
  o2.printTime();
  o3.printTime();
  
  o1.increment();
  o1.printTime();
  
  o2.reset();
  o2.printTime();
  
  }
}
  