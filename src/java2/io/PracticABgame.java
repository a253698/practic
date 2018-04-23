package java2.io;

import java.util.Scanner;

public class PracticABgame {

	public static void main(String[] args) {
		String secretnumber = "9876";
		int a = 0;
		int b = 0;
		// 先設AB值=0
		Scanner scanner = new Scanner(System.in);
		while (a != 4) {
			a = 0;
			b = 0;
			System.out.println("Please enter your guess:");
			String guessnums = scanner.nextLine();
			int length = secretnumber.length();
			for (int i = 0; i < guessnums.length(); i++) {
				char c = guessnums.charAt(i);
				//讀 guessnums 的第i位
				for (int j = 0; j < secretnumber.length(); j++) {
					if (c == secretnumber.charAt(j)) {
						//讀 secretnumber 的第j位
						if (i == j) {
							a++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.println(a + "A" + b + "B");
		}
	}
}