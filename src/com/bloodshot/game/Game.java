package com.bloodshot.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    // Variables for the window
    public static final int WIDTH = 1024;
    public static final int HEIGHT = WIDTH / 16 * 9;
    public static final String TITLE = "Bloodshot v0.01";
    public static int FPS;

    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);

    // Variables for the game
    private boolean running = false;
    private Thread game;

    public Game() {
	new Window(TITLE, WIDTH, HEIGHT, this);
    }

    public synchronized void start() {
	if (running)
	    return;
	running = true;
	game = new Thread(this);

	game.start();
    }

    public synchronized void stop() {
	running = false;
	if (game != null) {
	    try {
		game.join();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

    public void run() {
	long lastTime = System.nanoTime();
	double amountOfTicks = 60.0;
	double ns = 1000000000 / amountOfTicks;
	double delta = 0;
	long timer = System.currentTimeMillis();
	int updates = 0;
	int frames = 0;

	while (running) {
	    long now = System.nanoTime();
	    delta += (now - lastTime) / ns;
	    lastTime = now;
	    while (delta >= 1) {
		update();
		updates++;
		delta--;
	    }
	    render();
	    frames++;

	    if (System.currentTimeMillis() - timer > 1000) {
		timer += 1000;
		FPS = frames;
		System.out.println("FPS: " + frames + "\tUPDATES: " + updates);

		frames = 0;
		updates = 0;
	    }
	}
    }

    public void update() {
	
    }

    public void render() {
	BufferStrategy bs = this.getBufferStrategy();

	if (bs == null) {
	    this.createBufferStrategy(3);
	    return;
	}

	Graphics2D g = (Graphics2D) bs.getDrawGraphics();
	// ///////////////////////////////
	// DRAW HERE
	// ///////////////////////////////
	g.dispose();
	bs.show();
    }

    public static void main(String args[]) {
	Game game = new Game();
	System.out.println("WIDTH: " + game.getWidth() + " HEIGHT: " + game.getHeight());
	game.start();
	game.requestFocus();
    }

}
