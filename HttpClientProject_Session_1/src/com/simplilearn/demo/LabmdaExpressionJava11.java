package com.simplilearn.demo;
@FunctionalInterface
interface Register{
	void register();
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
		
		Register ref=()->{
			System.out.println("User Registered using Lambda Expression");
		};
		
		ref.register();
		
		//use Login and check
	}

}
