import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Steganography
{
   /*
   * Clear the lower (rightmost) two bits in a pixel.
   */
   public static void clearLow(Pixel p)
   {
      p.setRed((p.getRed()/4)*4);
      p.setGreen((p.getGreen()/4)*4);
      p.setBlue((p.getBlue()/4)*4);
   }
   
   public static Picture testClearLow(Picture p)
   {
      Picture pic = new Picture(p);
      Pixel[][] pixels = pic.getPixels2D();
      for(Pixel[] i : pixels)
      {
         for(Pixel j : i)
         {
            clearLow(j);
         }
      }
      return pic;
   }
   
   /**
   * Set the lower 2 bits in a pixel to the highest 2 bits in c
   */
   public static void setLow (Pixel p, Color c)
   {
      p.setRed((p.getRed()/4)*4 + (c.getRed()/64));
      p.setGreen((p.getGreen()/4)*4 + (c.getGreen()/64));
      p.setBlue((p.getBlue()/4)*4 + (c.getBlue()/64));
   }
   
   public static Picture testSetLow(Picture p, Color c)
   {
      Picture pic = new Picture(p);
      Pixel[][] pixels = pic.getPixels2D();
      for(Pixel[] i : pixels)
      {
         for(Pixel j : i)
         {
            setLow(j,c);
         }
      }
      return pic;
   }
   
   /**
   * Sets the highest two bits of each pixel’s colors
   * to the lowest two bits of each pixel’s color o s
   */
   public static Picture revealPicture(Picture hidden)
   {
      Picture copy = new Picture(hidden);
      Pixel[][] pixels = copy.getPixels2D();
      Pixel[][] source = hidden.getPixels2D();
      for (int r = 0; r < pixels.length; r++)
      {
         for (int c = 0; c < pixels[0].length; c++)
         {
            Color col = source[r][c].getColor();
            Pixel p = pixels[r][c];
            p.setRed((col.getRed()%4)*64);
            p.setGreen((col.getGreen()%4)*64);
            p.setBlue((col.getBlue()%4)*64);
         }
      }
      copy.setTitle("revealed");
      return copy;
   }
   
   /**
   * Determines whether secret can be hidden in source, which is
   * true if source and secret are the same dimensions.
   * @param source is not null
   * @param secret is not null
   * @return true if secret can be hidden in source, false otherwise.
   */
   public static boolean canHide(Picture source, Picture secret)
   {
      Pixel[][] sourceP = source.getPixels2D();
      Pixel[][] secretP = secret.getPixels2D();
      if(sourceP.length >= secretP.length && sourceP[0].length >= secretP[0].length)
      {
         return true;
      }
      return false;
   }
   
   /**
   * Creates a new Picture with data from secret hidden in data from source
   * @param source is not null
   * @param secret is not null
   * @return combined Picture with secret hidden in source
   * precondition: source is same width and height as secret
   */
   public static Picture hidePicture(Picture source, Picture secret)
   {
      Picture combined = new Picture(source);
      Pixel[][] sourceP = combined.getPixels2D();
      Pixel[][] secretP = secret.getPixels2D();
      for(int i = 0; i < sourceP.length; i++)
      {
         for(int j = 0; j < sourceP[0].length; j++)
         {
            Pixel yes = secretP[i][j];
            setLow(sourceP[i][j], yes.getColor());
         }
      }
      combined.setTitle("combinded");
      return combined;
   }
   
   /**
   * Creates a new Picture with data from secret hidden in data from source
   * @param source is not null
   * @param secret is not null
   * @param row is not null
   * @param col is not null
   * @return combined Picture with secret hidden in source in the row,col
   * precondition: source is same width and height as secret
   */
   public static Picture hidePicture(Picture source, Picture secret, int row, int col)
   {
      Picture combined = new Picture(source);
      Pixel[][] sourceP = combined.getPixels2D();
      Pixel[][] secretP = secret.getPixels2D();
      int width = secretP[0].length, height = secretP.length;
      for(int i = row, o = 0; i < sourceP.length && o < height; i++, o++)
      {
         for(int j = col, k = 0; j < sourceP[0].length && k < width; j++, k++)
         {
            Pixel yes = secretP[o][k];
            setLow(sourceP[i][j], yes.getColor());
         }
      }
      combined.setTitle("combinded");
      return combined;
   }
   
   /*
   * Check if the picture are the same
   * @param source is not null
   * @param other is not null
   * @return true or false if the picture is the same or not the same
   * precondition : souce and other have the same dimentsion
   */
   public static boolean isSame(Picture source, Picture other)
   {
      Pixel[][] sourceP = source.getPixels2D();
      Pixel[][] otherP = other.getPixels2D();
      for(int i = 0; i < sourceP.length; i++)
      {
         for(int j = 0; j < sourceP[0].length; j++)
         {
            if(sourceP[i][j].getRed() != otherP[i][j].getRed() || 
               sourceP[i][j].getGreen() != otherP[i][j].getGreen() || 
               sourceP[i][j].getBlue() != otherP[i][j].getBlue())
            {
               System.out.println("" + i + "," + j);
               return false;
            }
          }
       }
       return true;
    }
    
   /*
   * Find pixels location that is differnt   
   * @param source is not null
   * @param other is not null
   * @return a ArrayList of poistion that have different color value
   * precondition : souce and other have the same dimentsion
   */
    public static ArrayList findDifferences(Picture source, Picture other)
    {
      ArrayList<String> stringAL  = new ArrayList<>();
      Pixel[][] sourceP = source.getPixels2D();
      Pixel[][] otherP = other.getPixels2D();
      for(int i = 0; i < sourceP.length; i++)
      {
         for(int j = 0; j < sourceP[0].length; j++)
         {
            if(sourceP[i][j].getRed() != otherP[i][j].getRed() || 
               sourceP[i][j].getGreen() != otherP[i][j].getGreen() || 
               sourceP[i][j].getBlue() != otherP[i][j].getBlue())
            {
               stringAL.add(0, "x value:" + i + "; y value:" + j);
            }
          }
       }
       return stringAL;
    }
         
    public static void main(String[] args)
    {
      /*
      Picture source = new Picture ("gorge.jpg");
      Picture hide = new Picture("swan.jpg");
      Picture combined = new Picture();
      Picture unhide = new Picture();
      source.explore();
      hide.explore();
      if(canHide(source,hide))
      {
         combined = new Picture(hidePicture(source,hide));
      }
      combined.explore();
      unhide = new Picture(revealPicture(hide));
      unhide.explore();
      */
      
      
      
      Picture beach = new Picture("beach.jpg");
      Picture robot = new Picture("robot.jpg") ;
      Picture flower1 = new Picture("flower1.jpg");
      beach.explore();
      // these lines hide 2 pictures
      Picture hidden1 = hidePicture(beach, robot, 65, 208);
      Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
      System.out.println(isSame(hidden2, beach));
      System.out.print(findDifferences(hidden2, beach));
      //System.out.print(isSame(beach, beach));
      hidden2.explore();
      Picture unhidden = revealPicture(hidden1);
      unhidden.explore();
      
   }
}