public class Advance extends Ticket
{
  private int day = 0;

  public Advance(int day)
  {
    super();
    this.day = day;
    setPrice();
  }

  public void setPrice()
  {
    if(day > 10)
    {
      super.setPrice(30.00);
    }
    if(day < 10 && day > 0)
    {
      super.setPrice(40.00);
    }
  }

  public double getPrice()
  {
    return super.getPrice();
  }

  public String toString()
  {
    return super.toString();
  }
}