import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class MessagePost extends Post
{
    private String message;   // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }
    /**
     * Return the text of this post.
     * 
     * @return The post's text.
     */
    public String getText()
    {
        return message;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
        System.out.println(this.getUsername());
        System.out.println(message);
        System.out.print(timeString(this.getTimeStamp()));
        
        if(this.getLike() > 0)
        {
           System.out.println("  -  " + this.getLike() + " people like this.");
        }
        else
        {
           System.out.println();
        }
       
        if(this.getCommentSize() == 0)
        {
           System.out.println("   No comments.");
        }
        else
        {
           System.out.println("   " + this.getCommentSize() + " comment(s). Click here to view.");
        }
    }
    
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    private String timeString(long time)
    {
      long current = System.currentTimeMillis();
      long pastMillis = current - time;      // time passed in milliseconds
      long seconds = pastMillis/1000;
      long minutes = seconds/60;
      if(minutes > 0)
      {
         return minutes + " minutes ago";
      }
      else
      {
         return seconds + " seconds ago";
      }
    }
}