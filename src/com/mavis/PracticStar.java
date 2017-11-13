
package com.mavis;

public class PracticStar {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//層數的for迴圈
			for (int k = 10; k > i + 1; k--) {
				System.out.print(" ");
				//印出左邊空白
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
				//印出星號+右邊空白
			}
			System.out.println("");
		}
	}
}