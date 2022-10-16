public class Time
{
   private int hrs;
   private int mins;
   private int secs;
   
   //initialize everything to zero
   public Time()
   {
      hrs = 0;
      mins = 0;
      secs = 0;
   }
   
   //initialzie to h, m and s
   public Time(int h, int m, int s)
   {
     hrs = h;
     mins = m;
     secs = s;
   }
   
   //reset time
   public void reset()
   {
      hrs = 0;
      mins = 0;
      secs = 0;  
   }
   
   //Advances time by 1 second - Tricky!  Let me know if you need a hint!
   public void increment()
   {
      secs = secs + 1;
      
      if (secs > 59) 
      {
         secs = 0;
         mins = mins +1;
            
            if (mins > 59)
            {
               mins = 0;
               hrs = hrs + 1;
             }
               
               if (hrs > 23)
               {
                  hrs = 0;
                }
       }
    }
    
    public void printTime()
   {
      System.out.println(hrs + " , " + mins + " , " + secs);
   }
   

   
 }