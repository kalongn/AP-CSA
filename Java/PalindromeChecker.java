import java.util.Scanner;

public class PalindromeChecker
{
  public static void main(String[] args)
  {
    System.out.println("Enter a word to check if it is Plaindrome: ");
    Scanner temp = new Scanner(System.in);
    String testString = temp.nextLine();
    String trueOrFalse = "";
    if(isPalindrome(testString) == true)
    {
      trueOrFalse = "is";
    }
    else
    {
      trueOrFalse = "is not";
    }
    System.out.println("reverse of " + removeSpacesAndPunctuation(testString) + " is "+reverse(testString) + "\nIt " + trueOrFalse + " a Plaindrome");    
  }
  //returns the input String in reverse order
  public static String reverse(String input)
  {
    input = removeSpacesAndPunctuation(input);
    int length = input.length();
    String reverseInput = "";
    for( int index = length-1; index >=0; index--)
    {
      reverseInput = reverseInput + input.charAt(index);
    }
    return reverseInput;
  }
  
  //Checks if the input String is a palindrome
  public static boolean isPalindrome(String input)
  {
     if(reverse(input).equals(removeSpacesAndPunctuation(input)))
     {
         return true;
     }
     else
     {
         return false;
     }
  }
  
  //removes spaces and puncuation at the end.
  public static String removeSpacesAndPunctuation(String input)
  {
     String strippedStr = input.toLowerCase();
     strippedStr = strippedStr.replaceAll("[^A-Za-z]+", "");
     return strippedStr;
  }
 }
  
