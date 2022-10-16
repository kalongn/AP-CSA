/** You’ll have to add the JavaDocs comments for the class here! 
*/
//Ka Long Ngai Period 3 AP Java A
 public class PrimitiveTypes
{
  /** Displays an example of a string literal that
   *  uses escape  characters to display the single
   *  quote the double quote, the new line and the tab.
   */
   // MY COMMENT \" is double quote, \' is single quote, \n is a new tine and \t is a tab.
   public static void stringLiterals()
   {
      //this is where I shocase all those escape charater and string literal
      System.out.println("There are 3 primitive types which are int, double and boolean.\n int are use for a number without decial numbers.\n double are similar to int except it accept decimal values.\n boolean value allow us to set value to either true or false.");
      System.out.print("For example this is an \'int\' \n and this is a \"double\" value \n and this is a boolean\n \t These are the 3 primitive types");
   }
 
  /** Displays the three primitive types and
   *  their ranges used in the AP® Java A course.
   */  
   public static void primitiveTypes()
   {
      int x = 5;
      double y = 7.5;
      boolean z = true;
      System.out.println("There are 3 primitive types which are int, double and boolean.\n int are use for a number without decial numbers.\n double are similar to int except it accept decimal values.\n boolean value allow us to set value to either true or false.");
      System.out.print("For example this is an \'int\': " + x + "\n and this is a \"double\" value" + y + "\n and this is a boolean" + z + "\n \t These are the 3 primitive types");
   }
 
  /** Displays the five arithmetic operators.
   *  Gives examples of division and modulo.
   *  Gives an example of order of operations.
   */
   public static void arithmeticOperators()
   {
      int x = 2;
      int y = 3;
      int z = 4;
      System.out.println("There are 5 arithmetic operators which is + , - , * , / and %");
      System.out.println("This is what happen when you divide 4 by 2: " + (4/2));
      System.out.println("This is what happen when you mod 4 by 3: " + (4%3));
      System.out.println("This is a demonstration of order of operations of 4+2*3: " + (4+2*3));
      System.out.println("As you can see, it is same as doing math!!");
   }
 
  /** Displays and explains the five compound assignment operators.
   *  Displays and explains the increment and decrement
   *  for both prefix and postfix form.
   */
   public static void compoundAssignmentOperators()
   {
      int x = 2;
      int y = 3;
      int z = 4;
      System.out.println("There are 5 compoung assignment operators which are \n Incrementation: += \n Decrementation: -= \n Multiplication: *= \n Division: /= \n Modulus: %=");
      System.out.println("They are basically the same as the arithmetic operators but written in a different way and more commonly use.");
      System.out.println("This is a example of incremenation and decrementation, display number: " + x);
      x++;
      System.out.println("This is what happen after using x++" + x);
      x--;
      System.out.println("This is what happen after using x-- on the previous value" + x);
      System.out.println("This is prefix + profix example" + y);
      System.out.println(y--);
      //prefix
      System.out.println(y);
      //postfix
      System.out.println(++y);
   }
 
   /** Displays and explains casting between two different data types.
    *  Displays important examples regarding precision. 
    *  Displays how proper correct rounding can be implemented.
    */
    public static void castingVariables()
    {
      int x = 2;
      double y = 3.0;
      double z = y/x;
      int nearest = (int)(z+0.5);
      System.out.println("Casting is used when you want to change the \"shape\" of the object in Java such as changing an int to a double or other way around");
      System.out.println(2 / 3);
      System.out.println(x / y);
      System.out.println(y / x);
      System.out.println((double) y / x);
      System.out.println("This is what happen when you round the number with precision.");
      System.out.println("This is when the number is rounded accordingly" + nearest + " \n this is when a number is truncated: " + (int)z);
    } 
}