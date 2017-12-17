package com.mavis;

public class PracticDateCount {

	public static void main(String[] args) {
		int num = 66;
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