package com.rd.aspact;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice  implements AfterReturningAdvice{

	//public void before(Method method, Object[] args, Object target) throws Throwable {
//System.out.println("target class name ="+target.getClass());
//System.out.println("target method name ="+method.getName());
//System.out.println("target method args ="+Arrays.toString(args));

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("target class name ="+target.getClass());
		System.out.println("target method name ="+method.getName());
		System.out.println("target method args ="+Arrays.toString(args));
		System.out.println("return value"+returnValue.getClass());
	
	
		System.out.println("authintication is approved");
		if((Integer)args[0]==0)
	throw new IllegalArgumentException(" wrong order id");
	if((Integer)args[0]<0)
		args[0]=(Integer)args[0]*-1;
	
	FileWriter fw=new FileWriter("E:\\Auditlog.txt",true);

	fw.write(args[0]+" order has come for approval at"+new Date()+"\n");
	fw.flush();
	fw.close();
	}
	
}
