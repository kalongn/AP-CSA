public class ticketTest 
{
  public static void main(String[] args)
  {
    Ticket t1 = new Ticket();
    System.out.println(t1);
    Ticket t2 = new Walkup();
    System.out.println(t2);
    Ticket t3 = new Advance(11);
    System.out.println(t3);
    Ticket t4 = new Advance(7);
    System.out.println(t4);
    Ticket t5 = new StudentAdvance(12);
    System.out.println(t5);
  }
} 