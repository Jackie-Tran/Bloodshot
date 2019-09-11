package com.bloodshot.objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tree extends Object{
  
  private BufferedImage image;

  public Tree(int x, int y, int width, int height) {
    super(x, y, width, height);
    try {
      image = ImageIO.read(getClass().getResource("/Props/Trees/tree01.png"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // TODO Auto-generated constructor stub
  }

  @Override
  public void Update() {
    // TODO Auto-generated method stub
    x += 5;
  }

  @Override
  public void Render(Graphics2D g) {
    g.drawImage(image, null, x, y);
  }

}
