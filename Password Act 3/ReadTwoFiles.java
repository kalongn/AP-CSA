import java.util.Scanner; 
import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class ReadTwoFiles {
  public static void main(String[] args) throws Exception {
    // Create a File instance for passwords
    File passwordFile = new File("password.txt");
    // Create a File instance for common passwords
    File topPasswordList = new File("topPasswordList.txt");


    // Create a Scanner for the passwordFile
    Scanner input = new Scanner(passwordFile);
    
    String[] pwdFileAr = new String[25];
    int index = 0;
    // Read data from a file
    while (input.hasNext()) {
      String password = input.next();
      pwdFileAr[index] = password;
      index++;
      //System.out.println(password);
    }
    /*System.out.println("Array of logins and passwords: ");
    for( index = 0; index < pwdFileAr.length; index++)
    {
      System.out.println(pwdFileAr[index]);
    }*/

    // Close the file
    input.close();
    
    //Switch to the other file
    input = new Scanner(topPasswordList);
    // Read data from a file
      while (input.hasNext()) 
      {
        String password = input.next();
        for (int count = 0; count <=24; count++)
        {
            String loginAndPassword = pwdFileAr[count];
            String nameOfUser = loginAndPassword.substring(0,loginAndPassword.indexOf(":"));
            String hashedPassword = MessageDigestMethod.messageDigestMD5(password);
            if(loginAndPassword.substring(loginAndPassword.indexOf(":")+1).equals(hashedPassword))
            {
               System.out.println(nameOfUser + " " + password);
            }
            //System.out.println(MessageDigestMethod.messageDigestMD5(password));
        }
      }
    // Close the file
    input.close();

  }
}