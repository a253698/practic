package com.mavis;

import java.util.Scanner;

public class PracticStarScanner {

	public static void main(String[] args) {
		System.out.println("請輸入所要星星數");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			}
		}
	
}
