/**
 * Fraction.java
 * A class for representing a fraction
 * @author your name here
 * @since the date here
 */
public class Fraction
{
  /** instance variable for the numerator */  
  private int num;
  /** instance variable for the denominator */
  private int denom;

  /**
   * zero parameter constructor that sets numerator to zero and denominator to 1
   */
  public Fraction()       // no-args constructor
  {
      num = 0;
      denom = 1;
  }
  /**
   * one parameter constructor that sets numerator to n and denominator to 1
   * @param n the numerator of the fraction
   */
  public Fraction(int n)
  {
      num = n;
      denom = 1;
  }
  /** 
   * two parameter constructor that sets numerator to n and denominator to d
   * if the fraction is reducible it gets reduced using the private
   * @param n the numerator of the fraction
   * @param d the denominator of the fraction
   */
  public Fraction(int n, int d)
  {
      if( d != 0)
      {    
         num = n;
         denom = d;
         reduce();
      }
      else
      {
         throw new IllegalArgumentException("The denominator cannot be 0");
      }
  }
  /**
   * copy constructor makes a copy of the parameter "other"
   * @param other a Fraction to be copied
   */
  public Fraction(Fraction other)  // copy constructor
  {
      num = other.num;
      denom = other.denom;
  }

  // *** public methods ***

  /** Returns the sum of this fraction and other
   * @param other a Fraction that is to be added to the current fraction
   * @return the sum of this fraction and other
   */
  public Fraction add(Fraction other)
  {  
     int retDenom = denom*other.denom;
     int retNum = num*other.denom + other.num*denom;
     return new Fraction(retNum,retDenom);  
  }

  /** Returns the sum of this fraction and m
   * @param m the integer we are adding the fraction to 
   * @return the sum of this Fraction and m
   */
  public Fraction add(int m)
  {
     Fraction other = new Fraction(m);
     int retDenom = denom*other.denom;
     int retNum = num*other.denom + other.num*denom;
     /*
     int redDenom = denom;
     int retNum = num+(m*denom);
     */
     return new Fraction(retNum,retDenom);
  }

  /** Returns the product of this fraction and other
   * @param other the Fraction that is to be multiplied by the current fraction
   * @return the product of this fraction and other
   */
  public Fraction multiply(Fraction other)
  {
     int retDenom = denom*other.denom;
     int retNum = num*other.num;
     return new Fraction(retNum,retDenom); 
  }

  /** Returns the product of this fraction and m
   * @param m the integer that we are multipling the current fraction by
   * @return a Fraction that is the product of this fraction and m
   */
  public Fraction multiply(int m)
  {
     int retDenom = denom;
     int retNum = num*m;
     return new Fraction(retNum,retDenom);
  }

  /** Returns the value as a double of this fraction as a double 
   * @return the value as a double of this fraction as a double 
   */
  public double getValue()
  { 
      return (double) num/denom;
  }

  /** Returns a string representation of this fraction
    * @return the string representation of the fraction 
    */
  public String toString()
  {
    return "" + num + "/" + denom;
  }

  // *** private methods ***

  /** Reduces this fraction by the gcf and makes denom > 0 */
  private void reduce()
  {
      int gcd = gcf(num,denom);
      num = num/gcd;
      denom = denom/gcd;
      
      /*for(int count = Math.abs(denom); count > 1; count--)
      {
         if((count%Math.abs(denom)==0)&&(count%Math.abs(num)==0))
         {
            denom = denom/count;
            num = num/count;
            break;
         }
       }*/
  }

  /** Returns the greatest common factor of two positive integers 
   * @param n a positive integer representing the numerator
   * @param d a positive integer representing the denominator
   *  @return the greatest common divisor of two positive integers 
   *  
   */
  private int gcf(int n, int d)
  {
      int gcf = 0;
      for( int i = 1; i <= Math.abs(n) && i <= Math.abs(d); i++)
      {
         if((Math.abs(n)%i == 0)&&(Math.abs(d)%i==0))
         {
            gcf = i;
         }
       }           
      return gcf;
  }
}