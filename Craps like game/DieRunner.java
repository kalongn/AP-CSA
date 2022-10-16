public class DieRunner
{
  public static void main(String[] args)
  {
    Die d1 = new Die();
    Die d2 = new Die(6);
    Die d3 = new Die(1,6);
    
    System.out.println("Die 1 rolls out: " + d1.roll());
    System.out.println("Die 2 rolls out: " + d2.roll());
    System.out.println("Die 3 rolls out: " + d3.roll());
    
  }
}