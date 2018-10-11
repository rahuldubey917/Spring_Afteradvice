package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rd.service.OrderApprover;

public class Clientapp {

	public static void main(String[] args) {

		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/rd/cfgs/applicationcontext.xml");
		//get bean
		
		OrderApprover proxy=ctx.getBean("pfb",OrderApprover.class);
		
		//calling bussiness methods
		System.out.println("order approved?? "+proxy.approverOrder(1454));
		System.out.println("---------------------------------------------");
		System.out.println("order approved?? "+proxy.approverOrder(1456));
		System.out.println("---------------------------------------------");
		System.out.println("order approved?? "+proxy.approverOrder(0));
		
		((AbstractApplicationContext) ctx).close();
	}

}
