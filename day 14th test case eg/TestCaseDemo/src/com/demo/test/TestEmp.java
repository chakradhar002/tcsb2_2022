package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.Emp;
import com.demo.Logic;

public class TestEmp {
	
	Emp e =new Emp();
	Logic l = new Logic();
	
	
	@Test
	public void testSalMon() {
		e.setName("ram");
		e.setSalary(4500.12);
		
		double sal= l.calSal(e);
		assertEquals(99,002.64, sal);
		
		
	}

}
