package com.java2.snow;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class PracticSnowFrame extends JFrame {

	public static void main(String[] args) {
		new PracticSnowFrame();
	}

	SnowCanvas canvas = new SnowCanvas();

	public PracticSnowFrame() {
		setSize(850,650);
		setLocation(500,200);
		setVisible(true);
		add(canvas);
		canvas.repaint();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public class SnowCanvas extends Canvas {
		List<PracticSnow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				PracticSnow snow = new PracticSnow(this);
				snows.add(snow);
				snow.start();
			}
		}

		@Override
		public void paint(Graphics g) {
			for (int i = 0; i < 100; i++) {
				PracticSnow snow = snows.get(i);
				g.drawString("*", snow.x, snow.y);
			}
		}
	}
}