package com.simplilearn.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		 if(method.getName().equals("purchaseProduct")) {
			 System.out.println("[AfterAdvice] afterReturning executed "+method.getName());
		
			 System.out.println("[AfterAdvice] -Notifying in Action..");
			 Product product=(Product) target;
			 
			 System.out.println("[AfterAdvice] Notifying "+args[2]+"through email with invoice of amount "+product.price);
			 System.out.println("[AfterAdvice] Product "+product.brand+" "+product.name+" will be delivered at "+args[0]+" by "+args[1]);
			 System.out.println("[AfterAdvice] Notify the shipment and Dispatch Department for the purchase of "+product.name);
			
			 
		 }
		System.out.println();
	}
	
	

}
