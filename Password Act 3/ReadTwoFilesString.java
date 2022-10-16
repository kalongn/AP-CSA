import java.util.Scanner; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTwoFilesString 
{
  public static void main(String[] args) throws Exception 
  {   
    String firstpart = "";
    String lastpart = "";
    
    for(int count = 0; count < 25; count++)
    {
      String message = Files.readAllLines(Paths.get("password.txt")).get(count);
      firstpart = message.substring(0,message.lastIndexOf(":"));
      lastpart = message.substring(message.lastIndexOf(":")+1);
      for(int countTwo = 0; countTwo < 87; countTwo++)
      {
        String messageTwo = Files.readAllLines(Paths.get("topPasswordList.txt")).get(countTwo);
        String messageThree = MessageDigestMethod.messageDigestMD5(messageTwo);
        if(lastpart.equals(messageThree))
        {
           System.out.println(firstpart + " " + messageTwo);
        }
      }
    }
  }
}
