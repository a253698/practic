package com.mavis;

import java.util.Scanner;

public class PracticGameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = -100;
		while(q != 0) {
			System.out.print("輸入方向:");
			
			String line = scanner.nextLine();
			q = Integer.parseInt(line);
			
			switch(q) {
			
			case 2:
			System.out.println("Down");
			break;
			
			case 4:
			System.out.println("Left");
			break;
			
			case 6:
			System.out.println("Right");
			break;
			
			case 8:
			System.out.println("Up");
			break;
			
			case 0: 
				System.out.println("Gameover!");
				break;
			}
			
		}
		
	}
	
}
