import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a social network 
 * application.
 * 
 * Display of the posts is currently simulated by printing the details to the
 * terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not provide any
 * search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed
{
    private ArrayList<Post> post;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        post = new ArrayList<>();
    }
    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
      this.post.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details to the
     * terminal. (To do: replace this later with display in web browser.)
     */
    public void show()
    {
        // display all text posts
        for(Post message : post)
        {
            message.display();
            System.out.println();   // empty line between posts
        }
     }
    
    public static void main(String[] args)
    {
      Post Uno = new MessagePost("Pur", "is cold");
      Post Uno2 = new MessagePost("KLS", "is hot");
      Post Due = new PhotoPost("KLS", "cold", "someone is cold");
      Post Due2 = new PhotoPost("Pur", "hot", "someone is hot");
      Post tre = new Post("Pur_KLS");
      NewsFeed omg = new NewsFeed();
      omg.addPost(Uno);
      omg.addPost(Uno2);
      omg.addPost(Due);
      omg.addPost(Due2);
      omg.addPost(tre);
      omg.show();
    }
}