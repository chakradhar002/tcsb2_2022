package com.demo;

public class Logic {

	public double calSal(Emp emp) {

		double monthlysal = 0;

		monthlysal = emp.getSalary() * 22;
		return monthlysal;

	}

}
