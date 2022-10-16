public class ExperimentalFarmRunner
{
   public static void main(String[] args)
   {
      //Initialize part
      Plot one = new Plot("corn",20);
      Plot two = new Plot("corn",30);
      Plot three = new Plot("peas",20);
      Plot four = new Plot("peas",30);
      Plot five = new Plot("corn",40);
      Plot six = new Plot("corn",62);
      Plot seven = new Plot("wheat",10);
      Plot eight = new Plot("corn",50);
      Plot nine = new Plot("rice",30);
      Plot ten = new Plot("corn",55);
      Plot eleven = new Plot("corn",30);
      Plot twelve = new Plot("peas",30);
      
      Plot[][] theHolyPlot = {{one,two,three},{four,five,six},{seven,eight,nine},{ten,eleven,twelve}};
      ExperimentalFarm theFarm = new ExperimentalFarm(theHolyPlot);
      
      //testing part
      System.out.print(theFarm);
      System.out.print("=========================\n");
      System.out.println(theFarm.getHighestYield("corn"));
      System.out.println(theFarm.getHighestYield("peas"));
      System.out.println(theFarm.getHighestYield("bananas"));
      System.out.println(theFarm.getHighestYield("rice"));
      System.out.print("=========================\n");
      System.out.println(theFarm.sameCrop(0));
      System.out.println(theFarm.sameCrop(1));
      System.out.println(theFarm.sameCrop(2));
   }
}