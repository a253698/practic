package com.mavis;

import java.util.Scanner;

public class PracticInHome4 {
	
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner scanner1 = new Scanner(System.in);
		String line1 = scanner1.nextLine();
		System.out.println("Hello, " + line1 + ",  [type a blank and press enter.]" );
		
		Scanner scanner2 = new Scanner(System.in);
		String line2 = scanner2.nextLine();
		System.out.println("How are you today, " + line1 + ", [type good or not so good.]");
		
		Scanner scanner3 = new Scanner(System.in);
		String line3 = scanner3.nextLine();
		
		
		//if(line3 = good) {System.out.println("Good to hear that. ");}
		
		//else if(line3 = not so good) {System.out.println("I am sorry about that.");}
		
		
	}

}
