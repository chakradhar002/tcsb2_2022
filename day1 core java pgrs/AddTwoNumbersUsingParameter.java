package com.demo.add;
// passing parameter in method
 class AddTwoNumbersParameter {
	
	void AddDemo(int number1,int number2) {
		int result =number1+number2;
		System.out.println("sum of two numbers " + result);

	}

}


public class AddTwoNumbersUsingParameter {

	public static void main(String[] args) {

		AddTwoNumbersParameter b = new AddTwoNumbersParameter();// created object here
		b.AddDemo(45,45);//passing parameters here
		
	}

}

