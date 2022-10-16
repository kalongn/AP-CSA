public class horseRunner {
  public static void main(String[] args) 
  {
     HorseBarn barn = new HorseBarn(7);
     barn.setSpaces(0, new Horse("Trigger", 1340));
     barn.setSpaces(2, new Horse("Silver",1210));
     barn.setSpaces(3,  new Horse("Lady", 1575));
     barn.setSpaces(5, new Horse("Patches", 1350));
     barn.setSpaces(6, new Horse("Duke", 1410));

     // print out what is in the barn
     System.out.println(barn);

     // test
     System.out.println("Index of Trigger should be 0 and is " +
                        barn.findHorseSpace("Trigger"));
     System.out.println("Index of Silver should be 2 and is " +
                        barn.findHorseSpace("Silver"));
     System.out.println("Index of Coco should be -1 and is " +
                        barn.findHorseSpace("Coco"));
     //Testing consolidate
     barn.consolidate();
     System.out.println("After consolidate:");
     System.out.println(barn);
     
     //Example from part b 
     
     HorseBarn barn2 = new HorseBarn(7);
     barn2.setSpaces(0, new Horse("Trigger", 1340));
     barn2.setSpaces(2, new Horse("Silver",1210));
     barn2.setSpaces(5, new Horse("Patches", 1350));
     barn2.setSpaces(6, new Horse("Duke", 1410));
     
     System.out.println("before consolidate (of part b example)");
     System.out.println(barn2);
     barn2.consolidate();
     System.out.println("after consolidate (of part b example)");
     System.out.println(barn2);

  }
}