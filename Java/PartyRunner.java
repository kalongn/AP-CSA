
public class PartyRunner
{
   public static void main(String[] args)
   {
      Party p1 = new Party();
      p1.addPersonToParty();
      p1.printStatus();
      Party p2 = new Party();
      p2.cake(true);
      p2.printStatus();
      Party p3 = new Party(true,true,false);
      p3.printStatus();
    }
}