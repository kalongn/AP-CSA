/**
 * Snack.java - This is a class
 *
 */
public class Snack 
{
  /**
   * the variable for name
   *
   */
  private String name;
  /**
   * the variable for calories
   *
   */
  private int calories;
  
  /**
   * Zero parameter constructor
   *
   */
  public Snack()
  {
     name = "";
     calories = 0;
  }
  
  
  /**
   * 2 Parameters constructor
   *
   */
  public Snack(String n, int c)
  {
    name = n;
    calories = c;
  }
  /**
   * Return name method
   *
   */

  public String getName()
  {
      return name;
  }
  
  /**
   * return calories method
   *
   */
  public int getCalories()
  {
    return calories;
  }

  /**
   * set the name to string n
   *
   */
  public void setName(String n)
  {
    name = n;
  }

  /**
   * set the calories to int c
   *
   */
  public void setCalories(int c)
  {
    calories = c;
  }
  
  /**
   * check if calories is normal
   *
   */
  private boolean canEat() 
  {
      return (calories < 150);
  }
}