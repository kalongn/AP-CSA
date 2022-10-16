public class StudentAdvance extends Advance
{
  //class constructor
  public StudentAdvance(int days)
  {
    super(days);
    this.setPrice();
  }

  public void setPrice()
  {
    super.setPrice();
    super.setPrice(super.getPrice()/2);
  }
   
  //toString method for the class
  public String toString()
  {
    return super.toString()+"\n(Student ID required)";
  }
}