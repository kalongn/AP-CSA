public class Point
{
  private double x;
  private double y;
  
  public Point(double x, double y)
  {
      this.x = x;
      this.y = y;
  }
   
   public void setX(double x) 
   { 
       this.x = x;
   }
   
   public void setY(double y)
   {
       this.y = y;
   }
   
   public double getX()
   {
      return this.x;
   }
   
   public double getY()
   {
       return this.y;
   }
   
   public boolean equals(Point testPoint)
   {
      return ((getX() == testPoint.getX())&&(getY() == testPoint.getY()));
   }
   
   public double distance(Point other)
   {
      return Math.sqrt(Math.pow(other.getY()-this.getY(),2) + Math.pow(other.getX()-this.getX(),2));
   }
   
   public String toString()
   {
      return "("+this.getX()+","+this.getY()+")";
   }
}