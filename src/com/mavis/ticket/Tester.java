package com.mavis.ticket;

public class Tester {

	public static void main(String[] args) {

		OneWay p1 = new OneWay("2018-01-08", "18:30", "松山", "八賭", 65);
		p1.print();
		
		TwoWay p2 = new TwoWay("2018-01-08", "18:30", "松山", "八賭", 65, "2018-01-10", "20:45");
		p2.print();
	}

}