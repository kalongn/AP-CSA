public class Coordinate
{
   private double x, y;
   public Coordinate(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX() {return x;}
   public double getY() {return y;}
   
   public double getDistanceFrom(Coordinate c)
   {
      return Math.sqrt(Math.pow(y - c.getY(), 2) + Math.pow(x -c.getX(), 2));
   }

   public boolean equals(Coordinate c)
   {
      return x == c.getX() && y == c.getY();
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}  