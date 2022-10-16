public class Triangle
{
   private Point p1;
   private Point p2;
   private Point p3;
   
   public Triangle(Point p1, Point p2, Point p3)
   {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
   }
   
   
   
   public Point getP1()
   {
      return this.p1;
   }
   public Point getP2()
   {
      return this.p2;
   }
   public Point getP3()
   {
      return this.p3;
   }
   
   public void setP1(Point p1)
   {
      this.p1=p1;
   }
   public void setP2(Point p2)
   {
      this.p2=p2;
   }
   public void setP3(Point p3)
   {
      this.p3=p3;
   }
   
   /*public double distance(Point p1l, Point p2l)
   {
      return Math.sqrt(Math.pow(p2l.getY()-p1l.getY(),2) + Math.pow(p2l.getX()-p1l.getX(),2));
   }*/
   
   public double parameter()
   {
      return p1.distance(p2) + p2.distance(p3) + p1.distance(p3);
   }
   
   public double area()
   {
      double s = (parameter()/2);
      return Math.sqrt(s*(s - p1.distance(p2))*(s-p2.distance(p3))*(s-p1.distance(p3)));
   }
   
   public static boolean isAreaEqualto(Triangle t1, Triangle t2)
   {
      if(t1.area()==t2.area())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public boolean triequals(Triangle triequal)
   {
      return ((getP1().equals(triequal.getP1()))&&(getP2().equals(triequal.getP2()))&&(getP3().equals(triequal.getP3())));
   }
   
   public boolean isRight ()
   {
      double side1 = p1.distance(p2);
      double side2 = p2.distance(p3);
      double side3 = p3.distance(p1);
      if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
          ((side2*side2) == ((side1*side1) + (side3*side3))) ||
          ((side3*side3) == ((side1*side1) + (side2*side2))))
         return true;
      else
         return false;
   }
      
   public String toString()
   {
      return "(" + this.p1 + "," + this.p2 + "," + this.p3 + ")";
   }
}