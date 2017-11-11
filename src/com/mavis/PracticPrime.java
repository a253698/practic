package com.mavis;

public class PracticPrime {

	public static void main(String[] args) {
		int n = 17;
		for (int j = 2; j <= n; j++) {
			if (n % j == 0) {
				System.out.println("不是質數");
				break;
			} else {
				System.out.println("是質數");
				break;
			}
		}

	}

}
