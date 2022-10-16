public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();
  //Do something similar with Fraction 
  //Step 1: make an array of Fractions
  
     Fraction[] frAr = new Fraction[100];
     int num, denom;
     for(int i = 0; i<frAr.length; i++)
     {
         num = (int) (Math.random()*10)+1;
         denom = (int) (Math.random()*10)+1;
         frAr[i] = new Fraction(num,denom);
     }
      
     for(Fraction F : frAr)
     {
         System.out.println(F);
     }
  
  //Step 2: Construct random Fractions to fill out the array
     int impro = 0;
     for(Fraction F : frAr)
     {
         if(F.getValue()>1)
         {
            impro++;
         }
     }
     System.out.println(impro);
     
     for(Fraction F : frAr)
     {
         System.out.println((F.getValue()*100) + "%");
     }
  //Step 3: Find how many of the Fractions have your favorite property.
  }
}