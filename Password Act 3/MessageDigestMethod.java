import java.security.MessageDigest;
import java.util.Scanner;

public class MessageDigestMethod {
   public static void main(String args[]) throws Exception{
      
      //Reading data from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the message");
      String message = sc.nextLine();
      System.out.println("Hex String: "+messageDigestMD5(message));
  }
  
  public static String messageDigestMD5(String message) throws Exception
  {  
      //Creating the MessageDigest object  
      MessageDigest md = MessageDigest.getInstance("MD5");

      //Passing data to the created MessageDigest Object
      md.update(message.getBytes());
      
      //Compute the message digest
      byte[] digest = md.digest();      
      /*System.out.println(digest);  
      for (int i = 0; i <digest.length; i++)
        System.out.print(digest[i]);
      System.out.println();*/
     
      //Converting the byte array in to HexString format
      StringBuffer hexString = new StringBuffer();
      
      for (int i = 0;i<digest.length;i++) {
         hexString.append(Integer.toHexString(0xFF & digest[i]));
      }
      return hexString.toString();     
   }
   
   public static String printAfterCharacter(String message,String character)
   {
      int index = 0;
      String lastpart = "";
      while (message.indexOf(character) >= 0)
      {
          index = message.indexOf(character);
          lastpart = message.substring(index+1);
          //System.out.println(lastpart);
       }
       return lastpart;
    }
    
   public static String printBeforeCharacter(String message,String character)
   {
      int index = 0;
      String firstpart = "";
      while (message.indexOf(character) >= 0)
      {
          index = message.indexOf(character);
          firstpart = message.substring(0,index);
          //System.out.println(firstpart);
       }
       return firstpart;
    }
}