package com.bloodshot.game;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame{
  public Window(String title, int width, int height) {
    setName(title);
    
    Dimension dimension = new Dimension(width, height);
    setPreferredSize(dimension);
    setMinimumSize(dimension);
    setMaximumSize(dimension);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String args[]) {
    Window game = new Window("Bloodshot", 900, 600);
  }
}
