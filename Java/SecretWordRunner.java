public class SecretWordRunner {
  public static void main(String[] args)
  {
   //Construct three SecretWord objects and show how newWord(int num) works
      SecretWord s1 = new SecretWord("Map");
      SecretWord s2 = new SecretWord("Expansion");
      SecretWord s3 = new SecretWord("El Rubio");
      System.out.println(s1.newWord(2));
      System.out.println(s2.newWord(5));
      System.out.println(s3.newWord(4));
  }
}