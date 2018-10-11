package com.rd.service;

import java.util.Calendar;

public class OrderApprover {

	public String approverOrder(int orderid) {
		//get system date
		Calendar cl=Calendar.getInstance();
		
		//get current time and month
		int month=cl.get(Calendar.MONTH);
		if (month>=7 && month <=10)
			return orderid+" order is not approved";
		else
			return orderid+" order is approved";
		
	}//method
}//class
