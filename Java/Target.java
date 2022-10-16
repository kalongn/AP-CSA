// Question 2-13-a

import java.awt.*;
import javax.swing.*;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class Target extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.BLACK);
    g.fillOval(xCenter-150, yCenter-150, 300, 300); 
    g.setColor(Color.WHITE);
    g.fillOval(xCenter-125, yCenter-125, 250, 250); 
    g.setColor(Color.BLACK);
    g.fillOval(xCenter-100, yCenter-100, 200, 200); 
    g.setColor(Color.CYAN);
    g.fillOval(xCenter-75, yCenter-75, 150, 150);
    g.setColor(Color.RED);
    g.fillOval(xCenter-50, yCenter-50, 100, 100);
    g.setColor(Color.YELLOW);
    g.fillOval(xCenter-25, yCenter-25, 50, 50);

  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Target");
    window.setBounds(300, 300, 600, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.GRAY);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
