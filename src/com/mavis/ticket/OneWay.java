package com.mavis.ticket;

public class OneWay {
	
	String date;
	String time;
	String startStation;
	String arriveStation;
	int price;
	
	public OneWay (String date, String time, String startStation, String arriveStation, int price) {;
	this.date = date;
	this.time = time;
	this.startStation = startStation;
	this.arriveStation = arriveStation;
	this.price = price;
}
	public void print(){
		System.out.println("單程票:日期:     時間:   出發站:   抵達站:    票價: ");
		System.out.println("     " + date + "\t" + time + "\t" + startStation + "\t" + arriveStation + "\t" + price);
		System.out.println(" ");
	}
}