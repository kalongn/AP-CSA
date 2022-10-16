public class Die
{
  private int min;
  private int numSide;
 
 
  public Die()
  {
      min = 1;
      numSide = 6;
  }

    public Die(int sides)
  {
      min = 1;
      numSide = sides;
  }


   public Die(int sides, int minValue)
  {
      min = minValue;
      numSide = sides;  
  }

  public int roll()
  { 
      return (int) (Math.random()*numSide) + min;
  }
}