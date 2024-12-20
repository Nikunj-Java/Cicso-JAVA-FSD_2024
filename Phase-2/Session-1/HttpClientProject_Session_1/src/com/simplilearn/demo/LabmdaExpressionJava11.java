package com.simplilearn.demo;
@FunctionalInterface
interface Register{
	void register();
}

@FunctionalInterface
interface Login {
	void login(String email,String password);
}
@FunctionalInterface
interface PromoCodeDiscount{
	double getDiscountWithPromoCode(double amount,String promoCode);
}


//task to create Login Interface Here
//one method to login using email and password
class User implements Register{

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("User Registered");
		
	}
	
}

public class LabmdaExpressionJava11 {
	
	public static void main(String[] args) {
		/*Register ref=new Register() {
			
			@Override
			public void register() {
				// TODO Auto-generated method stub
				System.out.println("User Registered");
			}
		};
		
		ref.register();*/
		
		/*Register ref=()->{
			System.out.println("User Registered using Lambda Expression");
		};
		
		ref.register();*/
		
		//use Login and check
		
		Login loginref=(email,password)->{ //datatypes are not mendatory
			System.out.println("Connecting...");
			System.out.println("Validating User...");
			
			if(email.equals("nikunj@cisco.com")&& password.equals("Nikunj@123")) {
				System.out.println("Thankyou For Logging In With Email: "+email);
			}else {
				System.out.println("Login Failed!");
			}
		};
		
		loginref.login("nikunj@cisco.com", "Nikunj@123");
		
		/*PromoCodeDiscount promoCodeRef=(amount,promoCode)->{
			if(promoCode.equals("JUMBO")) {
				amount -=0.40*amount;
			}else {
				amount -=0.10*amount;
			}
			return amount;
		};*/
		
		//optimise the code
		PromoCodeDiscount promoCodeRef=(amount,promoCode)->{
			 double finalAmount=promoCode.equals("JUMBO")?(amount-0.40*amount):(amount-0.10*amount);
			 return finalAmount;
		};
			
		double amountToPay=promoCodeRef.getDiscountWithPromoCode(2000, "JUMBO");
		System.out.println("Net Amount to Pay: "+amountToPay);
		 
	}
	

}
