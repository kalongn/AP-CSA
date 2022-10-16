import java.util.Scanner;

public class NumberRounder
 {
  public static void main(String[] args) {
    System.out.println("Please Enter a number with Decimal: ");
    Scanner number = new Scanner(System.in);
    double Decimal = number.nextDouble();
    double nearestInt = (int)(Decimal + 0.5);
    int whole = (int)nearestInt;
    System.out.println("This is the number in whole number form: " + whole );
  }
}
