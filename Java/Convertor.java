import java.util.Scanner;

public class Convertor
 {
  public static void main(String[] args) {
    System.out.println("Please enter the Fahrenheit temperature in whole number: ");
    Scanner temp = new Scanner(System.in);
    double Fahrenheit = temp.nextDouble();
    double Celsius = (Fahrenheit - 32) * 5/9;
    System.out.println("This is the Fahrenheit in Celsius" + Celsius );
  }
}
