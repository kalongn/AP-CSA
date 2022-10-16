public class Thing

{

   //You'll need to add attributes here.
   String name;
    
   
   /** Constructs a new Thing named myName*/
   public Thing(String myName)
   { 
      name = myName;
   }
   
    
   /** Returns this Thing’s name*/
   public String getName()
   { 
       return name = null;
   }
   
    
   
   /** Sets this Thing’s name to newName*/   
   public void setName(String newName)
   { 
      name = newName;
   }
   
    
   
   /** Returns a message as described in part (b)*/   
   public void printMessage()
   { 
      System.out.println( name + " is great.");
   }
   
}