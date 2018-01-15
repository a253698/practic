package com.mavis;

import java.util.Scanner;

public class PracticDateCount {

	public static void main(String[] args) {
		
		System.out.println("Please type a number under 365:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int num = Integer.parseInt(line);
		
//		int num = 66;
		
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for (int i = 0; i <= m.length; i++) {
			if (num <= m[i]) {
				System.out.println((i + 1) + " 月 " + num + " 日 ");
				break;
			} else {
				num = num - m[i];
			}
		}
	}
}