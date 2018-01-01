package com.mavis;

import java.util.Scanner;

public class PracticMidNumber {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i;
		for (i = 1; i <= n; i++) {
			if (i > 10) {
				break;
			}
			if (i % 5 == 0) {
				System.out.print("#" + " ");
			}
			System.out.print(i + " ");
		}
	}
}
