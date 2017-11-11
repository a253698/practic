package com.mavis;

public class PracticNinerHorizontal {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				if ((i * j) < 10) {
					System.out.print(j + " x " + i + " =  " + (i * j) + "\t");
				} else {
					System.out.print(j + " x " + i + " = " + (i * j) + "\t");
				}
			}
			System.out.println("  ");
		}
	}
}
