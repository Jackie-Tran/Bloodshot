package com.bloodshot.gameState;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.bloodshot.objects.Player;

public class TestState {

    private Player player;
    
    public TestState() {
	player = new Player(100, 100, 32, 32, "/Sprites/big_demon_idle_anim_f0.png");
    }
    
    public void update() {
	player.Update();
    }
    
    public void render(Graphics2D g) {
	player.Render(g);
    }
    
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_A) {
	    player.setVelX(-player.getMoveSpeed());
	}
	
	if (e.getKeyCode() == KeyEvent.VK_D) {
	    player.setVelX(player.getMoveSpeed());
	}
	
	if (e.getKeyCode() == KeyEvent.VK_W) {
	    player.setVelY(-player.getMoveSpeed());
	}
	
	if (e.getKeyCode() == KeyEvent.VK_S) {
	    player.setVelY(player.getMoveSpeed());
	}
        
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_A) {
	    player.setVelX(0);
	}
	
	if (e.getKeyCode() == KeyEvent.VK_D) {
	    player.setVelX(0);
	}
	
	if (e.getKeyCode() == KeyEvent.VK_W) {
	    player.setVelY(0);
	}
	
	if (e.getKeyCode() == KeyEvent.VK_S) {
	    player.setVelY(0);
	}
    }
    
}
