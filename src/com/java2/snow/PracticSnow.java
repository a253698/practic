package com.java2.snow;

import java.awt.Canvas;
import java.util.Random;

public class PracticSnow extends Thread {

	Random r = new Random();
	int x;
	int y;
	private Canvas canvas;

	public PracticSnow(Canvas canvas) {
		this.canvas = canvas;
		x = r.nextInt(800);
		y = r.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = 0; i < 800; i++) {
			y = y + 1;
			int movement = r.nextInt(3) - 1;
			x = x - movement;
			canvas.repaint();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
