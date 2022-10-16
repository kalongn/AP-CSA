import java.util.ArrayList;
public class UserNameRunner
{
   public static void main(String[] args)
   {
      UserName johnSmithPossibleNames  = new UserName("john", "smith");
      System.out.println(johnSmithPossibleNames.getPossibleNames());
      UserName maryHartPossibleNames = new UserName("mary", "hart");
      System.out.println(maryHartPossibleNames.getPossibleNames());
      String[] used = {"harta", "hartm", "harty"};
      maryHartPossibleNames.setAvailableUserNames(used);
      System.out.println(maryHartPossibleNames.getPossibleNames());
      UserName dorothyVaughanPossibleNames = new UserName("dorothy", "vaughan");
      System.out.println(dorothyVaughanPossibleNames.getPossibleNames());
      String[] used2 = {"vaughand","vaughando"};
      dorothyVaughanPossibleNames.setAvailableUserNames(used2);
      System.out.println(dorothyVaughanPossibleNames.getPossibleNames());
   }
}