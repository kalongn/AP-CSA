public class LightSequenceRunner
{
  public static void main(String[] args) 
  {
   //set value for light Sequence
   LightSequence gradShow = new LightSequence("0101 0101 0101");
   //display original light Sequence
   gradShow.display();
   //update light Sequence 
   gradShow.changeSequence("0011 0011 0011");
   //display original light Sequence
   gradShow.display();
   //insert light Sequnce
   gradShow.insertSegment("1111 1111",4);
   //display original light Sequence
   gradShow.display();
   //old seq thing
   gradShow.changeSequence("1100000111");
   gradShow.removeDupSeq("11");
   gradShow.changeSequence("0000011");
   gradShow.removeDupSeq("11");
   gradShow.changeSequence("1100000111");
   gradShow.removeDupSeq("00");
   gradShow.changeSequence("11111");
   gradShow.removeDupSeq("00");
   //The Hypo of the light. I used function from point and Triangle to accomplished this.
   Point p1 = new Point(0.0,0.0);
   Point p2 = new Point(6.0,0.0);
   Point p3 = new Point(6.0,8.0);
   
   Triangle L1 = new Triangle(p1,p2,p3);
   System.out.println("The distance between the 2 light is: " + L1.distance(p1,p3));
   }
}
