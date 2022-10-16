public class Party
{
   private int numberOfPeople;
   private boolean partyStatus;
   private boolean lightStatus;
   private boolean isPartyStarted;
   private boolean isPartyFun;
   private boolean isMusicOn;
   private boolean isSingerHere;
   private boolean isTheCakeHere;
   
   public Party()
   {
      numberOfPeople = 4;
      isPartyFun = true;
   }
   
   public void cake(boolean yes)
   {
      isTheCakeHere = yes;
   }
    
   
   public Party(boolean started, boolean on, boolean here )
   {
      isPartyStarted = started;
      isMusicOn = on;
      isSingerHere = here;
   }
   
   public void addPersonToParty()
   {
      numberOfPeople = numberOfPeople + 1;
   }
   
   public void lightOn()
   {
      lightStatus = true;
   }
   
   public void lightoff()
   {
      lightStatus = false;
   }
   
   public void partyStart()
   {
      partyStatus = true;
   }
   
   public void partyStop()
   {
      partyStatus = false;
   }
   
   public void printStatus()
   {
      System.out.println("number of people in the party is " + numberOfPeople);
      System.out.println("Light is " + lightStatus);
      System.out.println("Party is " + partyStatus);
      System.out.println("Is party fun = " + isPartyFun);
      System.out.println("Is party started = " + isPartyStarted);
      System.out.println("Is music on = " + isMusicOn);
      System.out.println("Is singer here = " + isSingerHere);
   }

}
   
   