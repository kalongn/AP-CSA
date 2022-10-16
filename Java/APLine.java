public class APLine
{
   private int a, b, c;
   //construct a line
   public APLine(int a,int b,int c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   /*return a double value the slope of the line
     Pre condition: line was contructed correctly
     Post condition: return slope
   */
   public double getSlope()
   {
      return(double) (-1*this.a)/this.b;
   }
   /*
     Pre condition: user input 2 valid int value
     Post condition: return true/false
     return true if the input x and y value is on the line
     else return false*/
   public boolean isOnLine(int x, int y)
   {
      if(((this.a*x)+(this.b*y)+this.c) == 0)
      {
         return true;
      }
      return false;
    }
    //return the variable into a string
    public String toString()
    {
      return "" + this.a + "x + " + this.b + "y + " + this.c + " = 0";
    }
}    