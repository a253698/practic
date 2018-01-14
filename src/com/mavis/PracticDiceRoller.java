package com.mavis;

import java.util.Random;

public class PracticDiceRoller {

	public static void main(String[] args) {
		
			int count = 0;
		
		for (int i = 1; i < 10; i++) {
			Random r = new Random();
			int n1 = r.nextInt(6) + 1;
			int n2 = r.nextInt(6) + 1;
			int n3 = r.nextInt(6) + 1;
			int n4 = r.nextInt(6) + 1;
			
			if(n1 == 6) { count++;}
			if(n2 == 6) { count++;} 
			if(n3 == 6) { count++;} 
			if(n4 == 6) { count++;} 

			if (n1 != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4) {
				System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
				continue;
			} else {
				System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
				break;
			}
			
		}
		
		System.out.println("6點出現的次數:"+ count);
		}

	}


