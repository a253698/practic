package com.mavis.ticket;

public class TwoWay extends OneWay{
	
	String returnTime;
	String returnDate;
	float discount = 0.85f;
	
	public TwoWay(String date, String time, String startStation, String arriveStation, int price, String returnTime, String returnDate) {
		super(date, time, startStation, arriveStation, price);
		this.returnDate = returnDate;
		this.returnTime = returnTime;
	}
	
	public void print(){
		System.out.println("來回票:日期:     時間:   出發站:   抵達站:    票價:   回程日期:          回程時間:");
		System.out.println("     " + date + "\t" + time + "\t" + startStation + "\t" + arriveStation + "\t" + (int)(price*2*discount) + "\t" + returnTime + "\t" + returnDate);
		System.out.println(" ");
	}
	
}
