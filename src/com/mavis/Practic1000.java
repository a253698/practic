package com.mavis;

public class Practic1000 {
	public static void main(String[] args) {
		for(int i = 2 ; i < 1000 ; i++) {
			boolean prime = true;
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					prime = false; 
					break;
				}else {
					prime = true; 
				}
			}
		if (prime) {
			System.out.println(i);
		}
		}

	}
}
