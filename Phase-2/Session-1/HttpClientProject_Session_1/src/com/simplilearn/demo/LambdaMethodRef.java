package com.simplilearn.demo;

@FunctionalInterface
interface Register{
	void register();
}

@FunctionalInterface
interface Login{
	void login(String email,String password);
}
@FunctionalInterface
interface Taxes{
	double getAmountTopay(double amount);
}
class Authentication{
	static void registerUser() {
		System.out.println("Registering the User.....");
	}
	void loginUser(String username,String password) {
		if(username.equals("nikunj@cisco.com")&& password.equals("Nikunj@123")) {
			System.out.println("Login Successful...!");
		}else {
			System.out.println("Login Failed...!");
		}
		
	}
	
	double getFinalAmount(double amount) {
		return amount+(0.18*amount);
	}
}

public class LambdaMethodRef {
	
	public static void main(String[] args) {
		
		Register ref= Authentication::registerUser;
		ref.register();
		
		//Login loginRef=Authentication::loginUser;
		Authentication auth=new Authentication();
		Login loginref=auth::loginUser;
		loginref.login("nikunj@cisco.com", "Nikunj@123");
		
		Taxes tRef=auth::getFinalAmount;
		System.out.println("The Amount is: 1200");
		System.out.println("Taxes : 18%");
		System.out.println("Final Amount to pay After Taxes: "+tRef.getAmountTopay(1200));
	}

}
