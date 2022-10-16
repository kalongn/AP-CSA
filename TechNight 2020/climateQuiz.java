import java.util.Scanner;
import java.util.ArrayList;

public class climateQuiz
{
   public static void main(String[] args)
   {
      String q1 = "How many people on earth is not aware of climate change?";
      String q2 = "If we continue to pollute our environment, in how many years will the planet be inhabitable?";
      String q3 = "Is climate change different from global warming?";
      String q4 = "Why is climate change happening?";
      String q5 = "Should we take care the issue now?";
      String answer = "";
      int rightAnswer = 0;
      
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("a.20%");
      list1.add("b.30%");
      list1.add("c.40%");//the answer.
      list1.add("d.50%");
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("a.5 years");
      list2.add("b.10 years");
      list2.add("c.15 years");//the answer.
      list2.add("d.20 years");
      ArrayList<String> list3 = new ArrayList<String>();
      list3.add("a.yes");//the answer.
      list3.add("n.no");
      ArrayList<String> list4 = new ArrayList<String>();
      list4.add("a.green house effect");
      list4.add("b.earth temperature rising");
      list4.add("c.pollution");
      list4.add("d.all of the above");//answer
      ArrayList<String> list5 = new ArrayList<String>();
      list5.add("a.yes");//answer
      list5.add("b.no");
      
      //Question 1
      System.out.println("This is a mini quiz about climate change. \n Question 1: " + q1 + "\n" + list1 + "\n Please answer the question with the according letter");
      Scanner scan = new Scanner(System.in);
      answer = scan.nextLine();
      if(answer.equals("c"))
      {
         System.out.println("correct!!");
         rightAnswer++;
      }
      else
      {
         System.out.println("wrong, the answer is c");
      }
      //Question 2
      System.out.println("Question 2: " + q2 + "\n" + list2 + "\n Please answer the question with the according letter");
      scan = new Scanner(System.in);
      answer = scan.nextLine();
      if(answer.equals("c"))
      {
         System.out.println("correct");
         rightAnswer++;
      }
      else
      {
         System.out.println("wrong, the answer is c");
      }
      //Question 3
      System.out.println("Question 3: " + q3 + "\n" + list3 + "\n Please answer the question with the according letter");
      scan = new Scanner(System.in);
      answer = scan.nextLine();
      if(answer.equals("a"))
      {
         System.out.println("correct");
         rightAnswer++;
      }
      else
      {
         System.out.println("wrong, the answer is a");
      }
      //Question 4
      System.out.println("Question 4: " + q4 + "\n" + list4 + "\n Please answer the question with the according letter");
      scan = new Scanner(System.in);
      answer = scan.nextLine();
      if(answer.equals("d"))
      {
         System.out.println("correct");
         rightAnswer++;
      }
      else
      {
         System.out.println("wrong, the answer is d");
      }
      //Question 5
      System.out.println("Question 5: " + q5 + "\n" + list5 + "\n Please answer the question with the according letter");
      scan = new Scanner(System.in);
      answer = scan.nextLine();
      if(answer.equals("a"))
      {
         System.out.println("correct");
         rightAnswer++;
      }
      else
      {
         System.out.println("wrong, the answer is a");
      }
      scan.close();
      System.out.print("You finished the quiz and got: " + rightAnswer + " out of 5 question.");
    }
}
   