public class APCalendarRunner
{
  public static void main(String[] args)
  {
     //This is the runner and test all of method in APCalendar
     System.out.println("Number of leap years between 1700 - 1800: " + APCalendar.numberOfLeapYears(1700,1800));
     System.out.println("Number of leap years between 1900 - 2000: " + APCalendar.numberOfLeapYears(1900,2000));
     System.out.println("Day Of Year 12/31/1500: " + APCalendar.dayOfYear(12,31,1500));
     System.out.println("Day Of Year 12/31/2001: " + APCalendar.dayOfYear(12,31,2001));
     System.out.println("Day Of Year 12/31/1984: " + APCalendar.dayOfYear(12,31,1984));
     System.out.println("Day of Week 1/4/1970: " + APCalendar.dayOfWeek(1,4,1970));
     System.out.println("Day of Week 2/20/1865: " + APCalendar.dayOfWeek(2,20,1865));
     System.out.println("Day of Week 3/14/2000: " + APCalendar.dayOfWeek(3,14,2000));
     System.out.println("Day of Week 8/28/2021: " + APCalendar.dayOfWeek(8,28,2021));
     System.out.println("Is 1500 leap year: " + APCalendar.isLeapYear(1500));
     System.out.println("Is 2001 leap year: " + APCalendar.isLeapYear(2001));
     System.out.println("Is 1984 leap year: " + APCalendar.isLeapYear(1984));    
  }
}