package com.mavis;

public class PracticStarRightTriangle {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int j =4; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println(" ");
		}

	}

}
