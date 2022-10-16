public class APCalendar
{
   /** Returns true if year is a leap year and false otherwise. */
   public static boolean isLeapYear(int year)
   {
      if(year%400==0)
      {
         return true;
      }
      else if(year%100==0)
      {
         return false;
      }
      else if(year%4==0)
      {
         return true;
      }
      return false;
   }
   /** Returns the number of leap years between year1 and year2, inclusive.
   * Precondition: 0 <= year1 <= year2
   */
   public static int numberOfLeapYears(int year1, int year2)
   {
      int count = 0;
      for(int temp = year1; temp <= year2; temp++)
      {
         if(isLeapYear(temp))
         {
            count++;
         }
      }
      return count;
   }
   /** Returns the value representing the day of the week for the first day of year,
   * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
   */
   private static int firstDayOfYear(int year)
   {
      int k = 1, m = 11, d = (year%100)-1, c = (year/100);
      double w = (k + ((13*m-1)/5) + d + (d/4) + (c/4) - 2*c)%7;
      return (int)w;
   }
   /** Returns n, where month, day, and year specify the nth day of the year.
   * Returns 1 for January 1 (month = 1, day = 1) of any year.
   * Precondition: The date represented by month, day, year is a valid date.
   */
   public static int dayOfYear(int month, int day, int year)
   {
      int[] monthYes = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
      int[] monthDates = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
      int dayCount = 0;
      if(isLeapYear(year))
      {
         monthDates[1] = 29;
      }
      for(int i = 0; i< monthDates.length; i++)
      {
         if(month == monthYes[i])
         {
            for(int j = 1; j<= monthDates[i]; j++)
            {
              dayCount++;
              if(day == j)
              {
                 return dayCount;
              }
            }
          }
          dayCount = dayCount + monthDates[i];
       }
       return 0;   
   }
   /** Returns the value representing the day of the week for the given date
   * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
   * and 6 denotes Saturday.
   * Precondition: The date represented by month, day, year is a valid date.
   */
   public static int dayOfWeek(int month, int day, int year)
   {
      /* 0,1,2,3,4,5,6
         Su,M,Tu,W,Th,F,Sa
      */
      //int [] day = new int[] {0,1,2,3,4,5,6};
      int first = firstDayOfYear(year);
      int countU = dayOfYear(month, day, year);
      int yes = 0;
      if(isLeapYear(year))
      {
         yes = (first+countU-2)%7;
      }
      else
      {
         yes = (first+countU-1)%7;
      }
      return yes;  
   }
   // There may be instance variables, constructors, and other methods not shown.
}