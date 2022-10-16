import java.util.Scanner;

public class numberflip
{
  public static void main(String[] args) 
  {
   int ognum;
   int firstnum;
   int midnum;
   int lastnum;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Please enter the 3 number digit: ");
   ognum = scan.nextInt();
   
   firstnum = ognum / 100;
   
   midnum = (ognum / 10) % 10;
   
   lastnum = ognum % 10;
   
   System.out.print("This is the number in reverse: " + lastnum + midnum + firstnum);
   }
}
  
   
