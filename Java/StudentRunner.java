public class StudentRunner
{ 
  public static void main(String[] args)
  {
    //Create four students (with fake emails)
    Student s1 = new Student("Person 1" , "Person1@email.com");
    Student s2 = new Student("Person 2" , "Person2@email.com");
    Student s3 = new Student("Person 3" , "Person3@email.com");
    Student s4 = new Student("Person 4" , "Person4@email.com");
    
    //print out the student info for each student
    s1.print();
    s2.print();
    s3.print();
    s4.print();
   
    //change the of emails to their nycstudents.net email
    
    s1.setEmail("Person1@nycstudents.gov");
    s2.setEmail("Person2@nycstudents.gov");
    s3.setEmail("Person3@nycstudents.gov");
    s4.setEmail("Person4@nycstudents.gov");
    
    //change the names so they have the format first name, last name
   
    s1.setName("1 Person");
    s2.setName("2 Person");
    s3.setName("3 Person");
    s4.setName("4 Person");
    
    //test out the toString() method
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    
  }
} 