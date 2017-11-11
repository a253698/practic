package com.mavis;

public class PracticNiner {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i * j < 10) {
					System.out.println(i + " x " + j + " =  " + (i * j));
				} else {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
			}
			System.out.println(" ");
		}
	}

}
