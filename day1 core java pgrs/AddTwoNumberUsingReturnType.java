package com.demo.add;

class AddDemoReturn{
	
	int AddDemo(int number1,int number2) {
	
		int result =number1+number2;
		return result;

	}
	
}


//client in
public class AddTwoNumberUsingReturnType {
	
	public static void main(String[] args) {

		AddDemoReturn b = new AddDemoReturn();// created object here
		int result = b.AddDemo(45,45);//passing parameters here
		System.out.println("sum  of two num is "+result);
		
	}

}
