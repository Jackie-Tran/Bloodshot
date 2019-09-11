package com.bloodshot.objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Mob extends Object{
  
  private BufferedImage image;
  private int initX, initY;
  private int velX = 0;
  private int velY = 0;
  private int moveSpeed = 5;
  private int health;
  
  public Mob(int x, int y, int width, int height, String img, int health) {
    super(x, y, width, height);
    initX = x;
    initY = y;
    this.health = health;
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
      x += velX;
      y += velY;
      
  }
  
  public void randmove() {
    
  }
  
  public void changehp(int hp) {
    this.health += hp;
  }
  
  public int gethealth() {
    return health;
  }
  
  public void Move(int x, int y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public void Render(Graphics2D g) {
    g.drawImage(image, null, x, y);
  }

public int getVelX() {
    return velX;
}

public void setVelX(int velX) {
    this.velX = velX;
}

public int getVelY() {
    return velY;
}

public void setVelY(int velY) {
    this.velY = velY;
}

public int getMoveSpeed() {
    return moveSpeed;
}

public void setMoveSpeed(int moveSpeed) {
    this.moveSpeed = moveSpeed;
}

}
