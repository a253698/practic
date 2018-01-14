package com.mavis;

import java.util.Random;

public class PracticDiceRoller {

	public static void main(String[] args) {
		int C = 0;
		int M = 6;
		// M=六面
		int a[] = new int[M + 1];
		for (int k = 1; k <= 5; k++) {
			// k=骰幾次
			a[k] = k;
			for (int j = 1; j <= 4; j++) {
				// j=幾顆骰子
				Random r = new Random();
				a[k] = r.nextInt(6) + 1;
				
//				 if( k == k) {
//				 System.out.print(a[k]);
//				 }
			
				System.out.print(a[k]);
				if (a[k] == 6) {
					C++;
				}
			}
			System.out.print(" ");
		}
		System.out.print("6出現次數:" + C);

		//
		// int count = 0;
		//
		// for (int i = 1; i < 10; i++) {
		//
		// Random r = new Random();
		//
		// int n1 = r.nextInt(6) + 1;
		// int n2 = r.nextInt(6) + 1;
		// int n3 = r.nextInt(6) + 1;
		// int n4 = r.nextInt(6) + 1;
		//
		// if (n1 == 6) {
		// count++;
		// }
		// if (n2 == 6) {
		// count++;
		// }
		// if (n3 == 6) {
		// count++;
		// }
		// if (n4 == 6) {
		// count++;
		// }
		//
		// if (n1 != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4) {
		// System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		// continue;
		// } else {
		// System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		// break;
		// }
		// }
		// System.out.println("6點出現的次數:" + count);
	}

}
