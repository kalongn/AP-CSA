import java.util.Scanner;

public class TriangleRunner
{
   public static void main(String[] args)
   {
      /*double x = 0;
      double y = 0;
   
      System.out.println("This is a user input to check if 2 triangles area is the same");
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enther point one x value for triangle 1: ");
      x = scan.nextDouble();
      System.out.print("\nPlease enter point one y value for triangle 1: ");
      y = scan.nextDouble();
      Point p1 = new Point(x,y);
      System.out.print("\nPlease enther point two x value for triangle 1: ");
      x = scan.nextDouble();
      System.out.print("\nPlease enter point two y value for triangle 1: ");
      y = scan.nextDouble();
      Point p2 = new Point(x,y);
      System.out.print("\nPlease enther point three x value for triangle 1: ");
      x = scan.nextDouble();
      System.out.println("\nPlease enter point three y value for triangle 1: ");
      y = scan.nextDouble();
      Point p3 = new Point(x,y);
      System.out.print("\nPlease enther point one x value for triangle 2: ");
      x = scan.nextDouble();
      System.out.print("\nPlease enter point one y value for triangle 2: ");
      y = scan.nextDouble();
      Point p1t = new Point(x,y);
      System.out.print("\nPlease enther point two x value for triangle 2: ");
      x = scan.nextDouble();
      System.out.print("\nPlease enter point two y value for triangle 2: ");
      y = scan.nextDouble();
      Point p2t = new Point(x,y);
      System.out.print("\nPlease enther point three x value for triangle 2: ");
      x = scan.nextDouble();
      System.out.print("\nPlease enter point three y value for triangle 2: ");
      y = scan.nextDouble();
      Point p3t = new Point(x,y);
      scan.close();
   
      Triangle t1 = new Triangle(p1,p2,p3);
      Triangle t2 = new Triangle(p1t,p2t,p3t);
      
      System.out.println(t1);
      System.out.println("The triangle 1 that formed distance between p1 and p2 is: " + p1.distance(p2));
      System.out.println("The triangle 1 that formed distance between p2 and p3 is: " + p2.distance(p3));
      System.out.println("The triangle 1 that formed distance between p1 and p3 is: " + p1.distance(p3));
      System.out.println("the parameter of the triangle 1 is: " + t1.parameter());
      System.out.println("the area of the triangle 1 is: " + t1.area());
      System.out.println(t2);
      System.out.println("The triangle 2 that formed distance between p1 and p2 is: " + p1t.distance(p2t));
      System.out.println("The triangle 2 that formed distance between p2 and p3 is: " + p2t.distance(p3t));
      System.out.println("The triangle 2 that formed distance between p1 and p3 is: " + p1t.distance(p3t));
      System.out.println("the parameter of the triangle 2 is: " + t2.parameter());
      System.out.println("the area of the triangle 2 is: " + t2.area());
      System.out.println("This area of these 2 triangles are same? " + Triangle.isAreaEqualto(t1,t2));*/
      
     Triangle[] triAr = new Triangle[100];
     Point p1,p2,p3;
     for (int i = 0; i < triAr.length; i++)
     {
        //Make three random points - using a "do-while" to make sure there are
        //no repeats.
        do {
             p1 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p2 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p3 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
        } while (p1.equals(p2) || p1.equals(p3) || p3.equals(p2));
        
        //Construct a new Triangle from the points and put them into the array.
        triAr[i] = new Triangle(p1,p2,p3);
     }

     //You don't have to print all of them...  Just showing them!
     for (Triangle tri:triAr)
     {
        System.out.println(tri);
     }
     //Count the right triangles
     double countR = 0.0;
     for(Triangle i : triAr)
     {
         if(i.isRight())
         {
            countR++;
         }
      }
      System.out.println((double)(countR/100)*100 + "%");
     //Find the average perimeter of the whole list.
     double ava = 0;
     for(Triangle i : triAr)
     {
         ava = ava + i.parameter();
     }
     ava = ava/100;
     System.out.println(ava);     
      
   }
}