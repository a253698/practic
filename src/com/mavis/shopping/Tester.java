package com.mavis.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		Customer p1 = new Customer(1000);
		p1.print();

		SilverCustomer p2 = new SilverCustomer(1500);
		p2.print();

		GoldenCustomer p3 = new GoldenCustomer(2000);
		p3.print();
	}
}