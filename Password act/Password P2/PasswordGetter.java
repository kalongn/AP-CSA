public class PasswordGetter
{
   //LoginsAndPasswords2 has logins in the following formats:
   //for you to see: login0 password a123
   //login1 and login2 have the format: single lowercase character followed by three integer digits (from 0 to 9).
   //login3 and login4 have the format: two lowercase characters followed by three integer digits (0 to 9)
   //login5 and login6 have the format: three lower casse characters followed by three integer digits (0 to 9)
   //login7 and login8 have the format: four lower casse characters followed by three integer digits (0 to 9)
   public static void main(String[] args)
   {
      String login = "login0";
      String character = "abcdefghijklmnopqrstuvwxyz";
      for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
      {
         for(int guess = 0; guess <=999; guess++)
         {
            String password = "" + character.charAt(characterGuess);
            password = password + String.format("%03d",guess);
            boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
            if(gotIt)
            {
               System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
               break;
            }
         }
       }
       
       login = "login1";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int guess = 0; guess <=999; guess++)
         {
            String password = "" + character.charAt(characterGuess);
            password = password + String.format("%03d",guess);
            boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
            if(gotIt)
            {
               System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
               break;
            }
          }
         }
         
       login = "login2";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int guess = 0; guess <=999; guess++)
         {
            String password = "" + character.charAt(characterGuess);
            password = password + String.format("%03d",guess);
            boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
            if(gotIt)
            {
               System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
               break;
            }
          }
         }
         
       login = "login3";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int guess = 0; guess <=999; guess++)
            {
               String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo);
               password = password + String.format("%03d",guess);
               boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
               if(gotIt)
               {
                  System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                  break;
               }
             }
           }
         }
         
       login = "login4";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int guess = 0; guess <=999; guess++)
            {
               String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo);
               password = password + String.format("%03d",guess);
               boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
               if(gotIt)
               {
                  System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                  break;
               }
             }
           }
         }
         
       login = "login5";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int characterGuessThree = 0; characterGuessThree <= 25; characterGuessThree++)
            {
               for(int guess = 0; guess <=999; guess++)
               {
                  String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo) + character.charAt(characterGuessThree);
                  password = password + String.format("%03d",guess);
                  boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
                  if(gotIt)
                  {
                     System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                     break;
                  }
                }
             }
           }
         }
         
       login = "login6";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int characterGuessThree = 0; characterGuessThree <= 25; characterGuessThree++)
            {
               for(int guess = 0; guess <=999; guess++)
               {
                  String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo) + character.charAt(characterGuessThree);
                  password = password + String.format("%03d",guess);
                  boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
                  if(gotIt)
                  {
                     System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                     break;
                  }
                }
             }
           }
         }
         
       login = "login7";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int characterGuessThree = 0; characterGuessThree <= 25; characterGuessThree++)
            {
               for(int characterGuessFour = 0; characterGuessFour <= 25; characterGuessFour++)
               {
                  for(int guess = 0; guess <=999; guess++)
                  {
                     String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo) + character.charAt(characterGuessThree) + character.charAt(characterGuessFour);
                     password = password + String.format("%03d",guess);
                     boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
                     if(gotIt)
                     {
                        System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                        break;
                     }
                   }
                }
             }
           }
         }
         
       login = "login8";
       for(int characterGuess = 0; characterGuess <= 25;characterGuess++)
       {
         for(int characterGuessTwo = 0; characterGuessTwo <= 25; characterGuessTwo++)
         {
            for(int characterGuessThree = 0; characterGuessThree <= 25; characterGuessThree++)
            {
               for(int characterGuessFour = 0; characterGuessFour <= 25; characterGuessFour++)
               {
                  for(int guess = 0; guess <=999; guess++)
                  {
                     String password = "" + character.charAt(characterGuess) + character.charAt(characterGuessTwo) + character.charAt(characterGuessThree) + character.charAt(characterGuessFour);
                     password = password + String.format("%03d",guess);
                     boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
                     if(gotIt)
                     {
                        System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
                        break;
                     }
                   }
                }
             }
           }
         }


      /*for(int guess = 0; guess <= 999999; guess++)
      {
         String password = "" + guess;
         password = String.format("%06d",guess);
         boolean gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
         if(gotIt)
         {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            break;
         }
      }*/


      /*String login = "login0";
      String password = "a123";
      boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
      System.out.println(login+" and "+password+ " gotIt = "+gotIt);*/
   }
}