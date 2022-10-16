// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________

  public Rainbow()
  {
    setBackground(Color.GRAY);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
    int xCenter= width/2;
    int yCenter= height/2;
 
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________
    int radius = width/2;
    int drawCX = xCenter-(radius/2);
    int drawCY = yCenter-(radius/2);
    g.setColor(Color.RED);
    g.fillArc(drawCX, drawCY, radius, radius,0,180); 
    

    // Draw the large semicircle:
    // g.fillArc( ______________ );

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    radius = width/4;
    drawCX = xCenter-(radius/2);
    drawCY = yCenter-(radius/2);
    g.setColor(Color.GREEN);
    g.fillArc(drawCX, drawCY, radius, radius,0,180);
    radius = width/6;
    drawCX = xCenter-(radius/2);
    drawCY = yCenter-(radius/2);
    g.setColor(Color.MAGENTA);
    g.fillArc(drawCX, drawCY, radius, radius,0,180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
    int widthR= (width/2)-(width/4);
    int widthM = width/6;
    int average = (widthR+widthM)/2;
    radius = (width/4)-average ;
    drawCX = xCenter-(radius/2);
    drawCY = yCenter-(radius/2);
    g.setColor(Color.CYAN);
    g.fillArc(drawCX, drawCY, radius,radius,0,180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 600, 600);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}