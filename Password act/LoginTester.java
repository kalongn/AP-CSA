/**
   The file LoginsAndPasswords.class contains some fake logins and passwords/
   Here are three you can know for testing purposes:
   demologin0 has password 987654
   demologin6 has password 000123
   demologin8 has password 00000123
   
   You are tasked with finding the passwords for login1, login2, login3 and login4
   login1 and login2 have six digit integer logins.
   login3 and login4 have eight digit integer logins.

   You can write a loop (or 2) to help you find the passwords.

   There is a static method in LoginsAndPasswords you will use to check your guesses.
   Here is the signature: 
   public static boolean correctIdAndPassword(String name, String passwd)
   
   There is a little code below to help you see how the method works.
   There are also a few examples of String.format() to help you deal with leading zeros.
*/
class LoginTester 
{
  public static void main(String[] args)
  {
      String login = "login1";
      for(int guess = 0; guess <= 999999; guess++)
      {
         String password = "" + guess;
         password = String.format("%06d",guess);
         boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
         if(gotIt)
         {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            break;
         }
      }
      login = "login2";
      for(int guess = 0; guess <= 999999; guess++)
      {
         String password = "" + guess;
         password = String.format("%06d",guess);
         boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
         if(gotIt)
         {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            break;
         }
      }
      login = "login3";
      for(int guess = 0; guess <= 99999999; guess++)
      {
         String password = "" + guess;
         password = String.format("%08d",guess);
         boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
         if(gotIt)
         {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            break;
         }
      }
      login = "login4";
      for(int guess = 0; guess <= 99999999; guess++)
      {
         String password = "" + guess;
         password = String.format("%08d",guess);
         boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
         if(gotIt)
         {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            break;
         }
      }



      /*int guess = 987654;
      //correctIdAndPassword will tell you if you got the password and login correct
      String login = "demologin0";
      String password = "" + guess;
      boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
      System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);

      guess = 123;
      //to add leading zeros, use String.format()
      password = String.format("%06d",guess);
      System.out.println("password formatted with leading zeros "+password);
      //correctIdAndPassword will tell you if you got the password and login correct
      login = "demologin6";
      gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
      System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);

      //to add leading zeros, use String.format()
      password = String.format("%08d",guess);
      System.out.println("password formatted with leading zeros "+password);
      //correctIdAndPassword will tell you if you got the password and login correct
      login = "demologin8";
      gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
      System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
      password = "778";
      gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
      System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);*/
  }

}