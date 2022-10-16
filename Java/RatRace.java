public class RatRace
{
   int mickey, itchy, jerry;
   Cat felix, scratchy, tom;

   public RatRace()
   {
      race1();
      race2();
      race3();
      race4();
      race5();
      race6();
      race7();
      race8();
   }
   
   public void race1()
   {
      mickey = 1;
      itchy = 1;
      jerry = 1;
      sumRats(mickey, itchy, jerry);
      System.out.println("Mickey: " + mickey + ", Itchy: " + itchy + ", Jerry: " + jerry);
   }
   
   public void sumRats(int rat1, int rat2, int rat3)
   {
      rat1 += rat2;
      rat3 = 4;
   }

   public void race2()
   {
      mickey = 1;
      itchy = 1;
      jerry = 1;
      sumNamedRats(mickey, itchy, jerry);
      System.out.println("Mickey: " + mickey + ", Itchy: " + itchy + ", Jerry: " + jerry);
   }
   
   public void sumNamedRats(int mickey, int itchy, int jerry)
   {
      mickey += itchy;
      jerry += 4;
   }
   
   public void race3()
   {
      mickey = 1;
      itchy = 1;
      jerry = 1;
      sumMixedRats(mickey, itchy, jerry);
      System.out.println("Mickey: " + mickey + ", Itchy: " + itchy + ", Jerry: " + jerry);
   }
   
   public void sumMixedRats(int rat1, int rat2, int rat3)
   {
      mickey += rat2;
      rat1 += rat3;
      itchy -= rat1;
      jerry = rat3;
   }
   
   public void race4()
   {
      mickey = 1;
      itchy = 2;
      jerry = 3;
      
      mickey = returnSumRat(itchy, jerry);
      itchy = returnSumRat(mickey, jerry);
      jerry = returnSumRat(mickey, itchy);
      
      System.out.println("Mickey: " + mickey + ", Itchy: " + itchy + ", Jerry: " + jerry);
   }
   
   public int returnSumRat(int rat1, int rat2)
   {
      return rat2 + rat1;
   }

   public void race5()
   {
      mickey = returnThree();
      itchy = returnDividedRats(mickey, returnThree());
      jerry = returnMultipliedRats(mickey, itchy);
      
      System.out.println("Mickey: " + mickey + ", Itchy: " + itchy + ", Jerry: " + jerry);
   }
   
   public int returnThree()
   {
      return 3;
   }
   
   public int returnDividedRats(int rat1, int rat2)
   {
      return rat1 / rat2;
   }
   
   public int returnMultipliedRats(int rat1, int rat2)
   {
      return rat1 * rat2;
   }
   
   public void race6()
   {
       felix = new Cat("Felix", 1);
       scratchy = new Cat("Scratchy", 1);
       tom = new Cat("Tom", 1);
       
       sumCats(felix, scratchy, tom);
       System.out.println(felix + ", " + scratchy + ", " + tom);
   }
   
   public void sumCats(Cat cat1, Cat cat2, Cat cat3)
   {
      cat1.setCatValue(cat1.getCatValue() + cat2.getCatValue());
      cat3.setCatValue(4);
   }
   
   public void race7()
   {
       felix = new Cat("Felix", 1);
       scratchy = new Cat("Scratchy", 1);
       tom = new Cat("Tom", 1);
       
       makeNewCats(felix, scratchy, tom);       
       System.out.println(felix + ", " + scratchy + ", " + tom);
   }
   
   public void makeNewCats(Cat cat1, Cat cat2, Cat cat3)
   {
      cat1 = new Cat("Cheshire", 4);
      cat2 = new Cat("Garfield", 5);
      cat3 = new Cat("Mittens", 6);
   }
   
   public void race8()
   {
       felix = new Cat("Felix", 1);
       scratchy = new Cat("Scratchy", 1);
       tom = new Cat("Tom", 1);
       
       felix = copyCat(tom);
       scratchy = copyCat(felix);
       tom = copyCat(scratchy);       
       System.out.println(felix + ", " + scratchy + ", " + tom);
   }

   public Cat copyCat(Cat cat1)
   {
      return cat1;
   }
}