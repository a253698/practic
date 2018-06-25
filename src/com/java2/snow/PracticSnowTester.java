package com.java2.snow;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

public class PracticSnowTester {

	public static void main(String[] args) {
		List<PracticSnow> snows = new ArrayList<>();
		for (int n = 0; n < 150; n++) {
			Canvas canvas = null;
			PracticSnow snow = new PracticSnow(canvas);
			snow.start();
			snows.add(snow);
		}

	}
}
