package com.simplilearn.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println();
		System.out.println("[BeforeAdvice] Before Advice executed "+method.getName());
		System.out.println();
		
		//validate the stock preprocessing
		 if(method.getName().equals("purchaseProduct")) {
			 System.out.println("[BeforeAdvice] before Executed "+method.getName());
			 Product product=(Product) target;
			 if(product.getStock()<0) {
				 product.canBuy=false;
				 System.out.println("[Before Advice]- we are outof stock");
			 }else {
				 product.canBuy=true;
				 System.out.println("[BeforeAdvice] - Initiating Transaction for AMount of "+product.price+ ".....");
			 }
		 }
		
	}

}
