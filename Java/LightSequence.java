public class LightSequence
{
  // attributes not shown
  String originalSeq;
  String newSeq;
  String oldSeq;

  /** The parameter seq is the initial sequence used for
    * the light display */
  public LightSequence(String seq)
  {
      originalSeq = seq;
  }
  
  /** Inserts the string segment in the current sequence,
    * starting at the index ind. Returns the new sequence. */
  public String insertSegment(String segment, int ind)
  {
      originalSeq = originalSeq.substring(0,ind + 1) + segment + " " + originalSeq.substring(ind +1);
      return originalSeq;
  }
  
  /** Updates the sequence to the value in seq*/
  public void changeSequence(String seq)
  {
      originalSeq = seq;
  }
  //This is the weird oldSeq and the NewSeq part
  public void removeDupSeq(String dup)
  {
      oldSeq = originalSeq;
      if(oldSeq.contains(dup))
      {
         newSeq = oldSeq.replaceFirst(dup, "");
         System.out.println(newSeq);
      }
      else
      {
         System.out.println("The Sequence doesn't contain the " + dup);
      }
  }
  
  /** Uses the current sequence to turn the light on and off for the show */
  public void display()
  {
      System.out.println("The original Light Sequence are: " + originalSeq);
  }
} 
