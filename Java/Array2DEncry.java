import java.util.Scanner;

public class Array2DEncry
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sentence to encrypte: ");
      String text = sc.nextLine();
      sc.close();
      int plainLength = text.length();
      int rows = (int)Math.sqrt(plainLength);
      int columns = (int)Math.ceil(Math.sqrt(plainLength));
      if(rows*columns < plainLength)
      {
         rows++;
      }
      String[][] textArray = new String[rows][columns];
      int textIndex = 0;
      for(int i = 0; i < rows; i++)
      {
         for(int j = 0; j < columns; j++)
         {
            if(textIndex < plainLength)
            {
               textArray[i][j] = text.substring(textIndex, textIndex+1);
            }
            else
            {
               textArray[i][j] = "";
            }
            textIndex++;
         }
       }
       
       for(String[] i: textArray)
       {
         for(String j: i)
         {
            System.out.print(j);
         }
         System.out.println();
       }
       
       String encrypted = "";
       for(int i = 0; i < columns; i++)
       {
         for(int j = 0; j < rows; j++)
         {
            encrypted += textArray[j][i];
         }
       }
       System.out.println(encrypted);
       
       String decrypted = "";
       int index = 0;
       System.out.println(encrypted.length());
       for(int i = 0; i < encrypted.length(); i++)
       {
         System.out.println(index);
         if((index + rows) < encrypted.length())
         {
            decrypted += encrypted.substring(index, index + 1);
            index += rows;
            if((index + rows) >= encrypted.length())
            {
               index = 0;
            }
         }
         index += i;
       }
       System.out.println(decrypted);
   }
}
        