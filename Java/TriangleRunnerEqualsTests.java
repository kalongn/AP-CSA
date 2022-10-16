public class TriangleRunnerEqualsTests
{
  public static void main(String[] args) 
  {
     Point p1 = new Point(0.0,0.0);
     Point p2 = new Point(0.0,3.0);
     Point p3 = new Point(3.0,4.0);
     Point p1d = new Point(0.0,0.0);
     Point p2d = new Point(0.0,3.0);
     Point p3d = new Point(3.0,4.0);
          
     Triangle t1 = new Triangle(p1,p2,p3);
     Triangle t2 = new Triangle(p1d,p2d,p3d);
          
     System.out.println("t1 = "+t1);
     
     System.out.println("p1.equals(p2) is "+p1.equals(p2));
     System.out.println("p1 == p2 is "+(p1 == p2));
     System.out.println("p3.equals(p3d) is " + p3.equals(p3d));
     System.out.println("p3 == p3d is " + (p3 == p3d));
     System.out.println("t1.triequals(t2) is " + t1.triequals(t2));
     System.out.println("ti == t2 is " + (t1 == t2));
  
   }
}