
package com.mavis;

import java.util.Scanner;

public class NewHello {
	
		public static void main(String[] arges){
			System.out.println("�п�J�A���W�r:");
			//println �� ln �O�����@��
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			System.out.println("Hello,  " +line);
			
			System.out.println("�~��:");
			line = scanner.nextLine();
			int age = Integer.parseInt(line);		
			System.out.println(age);
			System.out.println(age > 25);
			
		}

}