public class Ticket 
{
  private static int serialNumber = 99; //unique ticket id number
  private double price = 10.00;

  public Ticket()
  {
    serialNumber = getNextSerialNumber();
  }

  //Default ticket price (might be overridden)
  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  //returns a string with serial number and price
  public String toString()
  {
    return "Numbers: " + this.serialNumber + "\nPrice: " + this.price;
  }
  //returns a new unique serial number
  
  private static int getNextSerialNumber()
  {
    serialNumber++;
    return serialNumber;
  }
  
}