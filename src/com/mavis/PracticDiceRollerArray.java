package com.mavis;

import java.util.Random;

public class PracticDiceRollerArray {

	public static void main(String[] args) {
	
			int C = 0;
			int M = 6;
			// M=六面
			int a[] = new int[M + 1];
			for (int k = 1; k <= 3; k++) {
				// k=骰幾次
				a[k] = k;
				for (int j = 1; j <= 4; j++) {
					// j=幾顆骰子
					Random r = new Random();
					a[k] = r.nextInt(6) + 1;
					
//					 if( a[k] == a[k]) {
//					 System.out.print(a[k]);
//					 break;
//					 }
//				
					System.out.print(a[k]);
					if (a[k] == 6) {
						C++;
					}
				}
				System.out.print(" ");
			}
			System.out.println(" ");
			System.out.println("6出現次數:" + C);

		}

	}
