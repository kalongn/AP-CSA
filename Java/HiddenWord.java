public class HiddenWord
{
   private String word;
   
   public HiddenWord(String word)
   {
      this.word = word;
   }
   
   public String getHint(String input)
   {
      String result = "";
      for(int i = 0; i < this.word.length(); i++)
      {
         if(input.substring(i,i+1).equals(this.word.substring(i,i+1)))
         {
            result += this.word.substring(i,i+1);
         }
         else if(this.word.contains(input.substring(i,i+1)))
         {
            result += "+";
         }
         else
         {
            result += "*";
         }
      }
      return result;
   }
   
   public static void main(String[] args)
   {
      HiddenWord puzzle = new HiddenWord("HARPS");
      
      System.out.println(puzzle.getHint("AAAAA"));
      System.out.println(puzzle.getHint("HELLO"));
      System.out.println(puzzle.getHint("HEART"));
      System.out.println(puzzle.getHint("HARMS"));
      System.out.println(puzzle.getHint("HARPS"));
   }
}