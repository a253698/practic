package com.mavis;

public class PracticOnePlusTwoPlusEtc {
	public static void main(String[] args) {
		int sum = 0;
		// sum = start with
		int i;

		for (i = 1; i <= 100; i++) {

			sum += i;
		}

		System.out.println("1 + 2 + .... + 99 + 100 =" + sum);
	}

}