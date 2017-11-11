package com.mavis;

import java.util.Scanner;

public class PracticTest {

	public static void main(String[] args) {
		System.out.println("以下誰的年紀最大??");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		
		if(n == 3) {
			System.out.println("Yes");
		}else {
			System.out.println("Wrong");
		}
	}

}
