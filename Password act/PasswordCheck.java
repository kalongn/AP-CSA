public class PasswordCheck
{
   public static void main(String[] args)
   {
      String passwordStr = "";
      String login = "login1";
   
      for(int passwordInt = 0; passwordInt <= 999999; passwordInt++)
      {
         passwordStr = String.format("%06d", passwordInt);
         boolean test = LoginsAndPasswords.correctIdAndPassword(login,passwordStr);
         if(test)
         {
            System.out.println("The password is " + passwordInt);
            break;
         }
      }
   }
}
