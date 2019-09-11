package com.bloodshot.objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player extends Object{
  
  private BufferedImage image;

  public Player(int x, int y, int width, int height, String img) {
    super(x, y, width, height);
    try {
      image = ImageIO.read(getClass().getResource(img));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // TODO Auto-generated constructor stub
  }

  @Override
  public void Update() {
    // TODO Auto-generated method stub
  }
  
  public void Move(int x, int y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public void Render(Graphics2D g) {
    g.drawImage(image, null, x, y);
  }

}
