package com.bloodshot.game;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame {
    public Window(String title, int width, int height, Game game) {
	Dimension dimension = new Dimension(width, height);
	setTitle(title);
	setPreferredSize(dimension);
	setMinimumSize(dimension);
	setMaximumSize(dimension);
	add(game);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);
    }
}
