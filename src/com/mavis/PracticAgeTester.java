package com.mavis;

import java.util.Scanner;

public class PracticAgeTester {

	public static void main(String[] args) {
		System.out.println("Please type in your age:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 7) {
			System.out.println("讀幼稚園嗎??");
		} else {
			if (age < 12) {
				System.out.println("讀國小嗎??");
			} else {
				if (age < 15) {
					System.out.println("讀國中嗎??");
				} else {
					if (age < 18) {
						System.out.println("讀高中嗎??");
					} else {
						System.out.println("找工作還念大學了?");
					}
				}
			}
		}
	}
}
