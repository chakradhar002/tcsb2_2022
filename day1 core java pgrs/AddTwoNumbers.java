package com.demo.add;

class BusinessLogic {

	void AddDemo() {

		int number1 = 10;//hard coded here
		int number2 = 20;
		int result = number1 + number2;
		System.out.println("sum of two numbers " + result);

	}

}

public class AddTwoNumbers {

	public static void main(String[] args) {

		BusinessLogic b = new BusinessLogic();// created object here
		b.AddDemo();
		
	}

}
